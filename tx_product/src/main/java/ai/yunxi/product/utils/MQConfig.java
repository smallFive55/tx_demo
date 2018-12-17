package ai.yunxi.product.utils;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 
 * @author 小五老师-云析学院
 * @createTime 2018年10月26日 下午3:55:43
 * 
 */
@Configuration
public class MQConfig {

	//定义分布式事务队列
	@Bean
	public Queue queueMessageTx(){
		return new Queue(MQProperties.QUEUE_NAME_TX);
	}
	
	//定义分布式事务交换器
	@Bean
	public DirectExchange exchangeTx(){
		return new DirectExchange(MQProperties.EXCHANGE_NAME_TX);
	}
	
	//绑定分布式事务队列与交换器
	@Bean
	public Binding bindingExchangeMessageTx(@Qualifier("queueMessageTx") Queue queueMessage, @Qualifier("exchangeTx") DirectExchange exchange){
		return BindingBuilder.bind(queueMessage).to(exchange).with(MQProperties.ROUTE_KEY_TX);
	}

	//事务处理成功队列
	@Bean
	public Queue queueMessageTxReturnSuccess(){
		return new Queue(MQProperties.QUEUE_NAME_TX_RETURN_SUCCESS);
	}
	//定义事务回滚队列
	@Bean
	public Queue queueMessageTxReturnFailure(){
		return new Queue(MQProperties.QUEUE_NAME_TX_RETURN_FAILURE);
	}
	//定义事务交回滚换器
	@Bean
	public DirectExchange exchangeTxReturn(){
		return new DirectExchange(MQProperties.EXCHANGE_NAME_TX_RETURN);
	}
	//绑定分布式事务队列与交换器
	@Bean
	public Binding bindingExchangeMessageTxReturnSuccess(@Qualifier("queueMessageTxReturnSuccess") Queue queueMessage, @Qualifier("exchangeTxReturn") DirectExchange exchange){
		return BindingBuilder.bind(queueMessage).to(exchange).with(MQProperties.ROUTE_KEY_TX_RETURN_SUCCESS);
	}
	//绑定分布式事务队列与交换器
	@Bean
	public Binding bindingExchangeMessageTxReturnFailure(@Qualifier("queueMessageTxReturnFailure") Queue queueMessage, @Qualifier("exchangeTxReturn") DirectExchange exchange){
		return BindingBuilder.bind(queueMessage).to(exchange).with(MQProperties.ROUTE_KEY_TX_RETURN_FAILURE);
	}
}
