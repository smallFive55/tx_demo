package ai.yunxi.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ai.yunxi.core.entity.Order;
import ai.yunxi.product.service.IProductService;

/**
 * 
 * @author 小五老师-云析学院
 * @createTime 2018年12月11日 下午6:27:10
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ProductApplication.class)
public class ProductTest {

	@Autowired
	private IProductService productService;
	
	@Test
	public void updateProduct() throws Exception{
		Order order = new Order();
		order.setProductId(1006);
		order.setCustomer("Five");
		order.setNumber(1);
		productService.updateProduct(order);
	}
}
