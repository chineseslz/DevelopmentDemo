package cn.itcast.mq.listener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SpringRabbitListener {

//    @RabbitListener(queues = "simple.queue")
//    public void listenSimpleQueue(String message){
//        System.out.println(message);
//    }

    @RabbitListener(queues = "fanout.queue1")
    public void listenFanoutQueue1(String message){
        System.out.println("fanout.queue1的消息："+message);
    }
    @RabbitListener(queues = "fanout.queue2")
    public void listenFanoutQueue2(String message){
        System.out.println("fanout.queue2的消息："+message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue1"),
            exchange = @Exchange(name = "itcast.direct"),
            key = {"red","yellow"}
    ))
    public void listenDirectQueue1(String message){
        System.out.println("direct.queue1的消息："+message);
    }
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue2"),
            exchange = @Exchange(name = "itcast.direct"),
            key = {"red","blue"}
    ))
    public void listenDirectQueue2(String message){
        System.out.println("direct.queue2的消息："+message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "topic.queue1"),
            exchange = @Exchange(name = "itcast.topic",type = ExchangeTypes.TOPIC),
            key = {"#.news"}
    ))
    public void listenTopicQueue1(String message){
        System.out.println("topic.queue1的消息："+message);
    }
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "topic.queue2"),
            exchange = @Exchange(name = "itcast.topic",type = ExchangeTypes.TOPIC),
            key = {"china.#"}
    ))
    public void listenTopicQueue2(String message){
        System.out.println("topic.queue2的消息："+message);
    }


    @RabbitListener(queues = "object.queue")
    public void listenObjectQueue(Map<String,Object> map){
        System.out.println("topic.queue2的消息："+map);
    }

}
