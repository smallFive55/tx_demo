package ai.yunxi.order;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ai.yunxi.core.entity.Order;
import ai.yunxi.order.service.IOrderService;

/**
 * 
 * @author 小五老师-云析学院
 * @createTime 2018年12月11日 下午6:35:46
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderApplication.class)
public class OrderTest {

	@Autowired
	private IOrderService orderService;

	private final int THREAD_NUM=110;
	private final CountDownLatch cdl = new CountDownLatch(THREAD_NUM);
	
	@Test
	public void createOrder() throws InterruptedException{
		try {
			Order order = new Order();
			order.setProductId(1006);
			order.setCustomer("Five");
			order.setNumber(1);
			orderService.shopping(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(10);
	}
	
	@Test
	public void createOrder4MQ() throws InterruptedException{
		for (int i = 0; i < THREAD_NUM; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					Order order = new Order();
					order.setProductId(1006);
					order.setCustomer("Five");
					order.setNumber(1);
					try {
						cdl.await();
						orderService.shopping4MQ(order);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
			cdl.countDown();
		}
		TimeUnit.SECONDS.sleep(20);
	}
}
