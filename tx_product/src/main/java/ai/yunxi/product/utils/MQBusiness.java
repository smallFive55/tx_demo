package ai.yunxi.product.utils;

import org.json.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

import ai.yunxi.core.entity.Order;
import ai.yunxi.product.service.IProductService;

/**
 * 
 * @author 小五老师-云析学院
 * @createTime 2018年12月11日 下午4:36:38
 * 
 */
@Component
@RabbitListener(queues=MQProperties.QUEUE_NAME_TX)
public class MQBusiness {

	@Autowired
	private IProductService productService;
	
	@RabbitHandler
	public void process(String body, Channel channel, Message message) throws Exception {
		JSONObject obj = new JSONObject(body);
		int orderId = obj.getInt("orderId");
		int productId = obj.getInt("productId");
		int number = obj.getInt("number");
		Order order = new Order();
		order.setOrderId(orderId);
		order.setProductId(productId);
		order.setNumber(number);
		productService.updateProduct4MQ(order, channel, message);
	}

}
