package ai.yunxi.product.utils;

/**
 * 
 * @author 小五老师-云析学院
 * @createTime 2018年12月11日 下午4:40:00
 * 
 */
public class MQProperties {

	public static final String QUEUE_NAME_TX="tx.order";
	
	public static final String EXCHANGE_NAME_TX="tx.order.exchange";
	
	public static final String ROUTE_KEY_TX="tx.order.create";

	//事务处理成功队列
	public static final String QUEUE_NAME_TX_RETURN_SUCCESS="tx.order.return.success";
	//事务回滚队列
	public static final String QUEUE_NAME_TX_RETURN_FAILURE="tx.order.return.failure";
	//事务交换器
	public static final String EXCHANGE_NAME_TX_RETURN="tx.order.exchange.return";
	
	public static final String ROUTE_KEY_TX_RETURN_SUCCESS="tx.order.create.success";
	
	public static final String ROUTE_KEY_TX_RETURN_FAILURE="tx.order.create.failure";
}
