package ai.yunxi.product.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ai.yunxi.core.entity.Order;
import ai.yunxi.product.service.IProductService;

/**
 * 
 * @author 小五老师-云析学院
 * @createTime 2018年12月11日 下午7:17:58
 * 
 */
@RestController
@RequestMapping(value="/product")
public class ProductConnection {

	@Autowired
	private IProductService service;
	
	@RequestMapping(value="/updateProduct", produces = "application/json;charset=UTF-8;")
	public String updateProduct(@RequestParam int productId, @RequestParam int number) throws Exception{
		Order order = new Order();
		order.setNumber(number);
		order.setProductId(productId);
		int row = service.updateProduct(order);
		
		if(row==0) throw new RuntimeException("============修改库存失败。"); 
		return "true";
	}
}
