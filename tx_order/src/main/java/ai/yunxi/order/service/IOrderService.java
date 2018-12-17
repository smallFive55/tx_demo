package ai.yunxi.order.service;

import ai.yunxi.core.entity.Order;

/**
 * 
 * @author 小五老师
 * @createTime 2018年7月24日 上午11:48:27
 * 
 */
public interface IOrderService {

	public int shopping(Order order) throws Exception;

	public int shopping4MQ(Order order) throws Exception;
	
	public void shoppingRollback(int orderId) throws Exception;
	
	public void shoppingCommit(int orderId) throws Exception;
}
