package cn.itcast.mq.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAmqTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend(){
        String queueName = "simple.queue";
        String message = "hello,spring amqp!";
        rabbitTemplate.convertAndSend(queueName,message);
    }

    @Test
    public void testSendFanoutExchange(){
        String exchangeName = "itcast.fanout";
        String message = "hello,every one!";
        rabbitTemplate.convertAndSend(exchangeName,"",message);
    }

    @Test
    public void testSendDirectExchange(){
        String exchangeName = "itcast.direct";
        String message = "hello,every one!";
        rabbitTemplate.convertAndSend(exchangeName,"blue",message);
    }

    @Test
    public void testSendTopicExchange(){
        String exchangeName = "itcast.topic";
        String message = "hello,every one!";
        rabbitTemplate.convertAndSend(exchangeName,"china.news",message);
    }

    @Test
    public void testSendObjectQueue(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","柳岩");
        map.put("age",21);
        rabbitTemplate.convertAndSend("object.queue",map);
    }

}
