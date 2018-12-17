package ai.yunxi.order.mapper;

import org.apache.ibatis.annotations.Mapper;

import ai.yunxi.core.entity.Order;

/**
 * 
 * @author 小五老师
 * @createTime 2018年7月24日 上午11:48:27 
 * 
 */
@Mapper
public interface OrderMapper {
	public int insert(Order order);
	public int delete(int orderId);
	public int update(int orderId);
}
