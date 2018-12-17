package ai.yunxi.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;

import ai.yunxi.core.entity.Order;
import ai.yunxi.order.mapper.OrderMapper;
import ai.yunxi.order.service.IOrderService;
import ai.yunxi.order.utils.MQClientInfo;
import ai.yunxi.order.utils.MQProperties;

/**
 * 
 * @author 小五老师
 * @createTime 2018年7月24日 上午11:48:27 
 * 
 */
@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private MQClientInfo mqInfo;
	
	private RestTemplate template = new RestTemplate();
	/**
	 * 客户下单
	 **/
	@Transactional
	public int shopping(Order order) throws Exception {
		System.out.println("============创建订单 ");
		int row = orderMapper.insert(order); //下单，插入Order表
		
		if(row>0){
			//通过接口调用库存系统，修改库存。
			String url = "http://localhost:8082/product/updateProduct?productId="+order.getProductId()+"&number="+order.getNumber();
			String result = template.getForEntity(url, String.class).getBody();
			System.out.println(result);
		}
		return row;
	}
	
	@Transactional
	public int shopping4MQ(Order order) throws Exception {
		System.out.println("============创建订单");
		int row = orderMapper.insert(order); //下单，插入Order表
		
		if(row>0){
			Channel channel = mqInfo.getConnection().createChannel();
			try {
				channel.txSelect(); //开启MQ事务   或者使用Confirm机制
				//下单成功后，将订单信息保存至RabbitMQ中，由库存系统从MQ中获取数据，修改库存。
				channel.basicPublish(MQProperties.EXCHANGE_NAME_TX, MQProperties.ROUTE_KEY_TX, MessageProperties.PERSISTENT_TEXT_PLAIN, order.toString().getBytes()); //发送消息
				//...
				channel.txCommit(); //提交MQ事务   
			} catch (Exception e) {
				//MQ消息发送失败，回滚事务
				channel.txRollback();
				throw e; //继续抛出异常，回滚本地事务
			}
		}
		return 0;
	}
	
	@Transactional
	public void shoppingRollback(int orderId) throws Exception {
		System.out.println("============删除订单");
		orderMapper.delete(orderId);
	}

	@Override
	public void shoppingCommit(int orderId) throws Exception {
		System.out.println("============业务处理成功，修改订单状态");
		orderMapper.update(orderId);
	}
	
}
