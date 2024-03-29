package cn.itcast.order.service;

import cn.itcast.feign.client.UserClients;
import cn.itcast.feign.pojo.User;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private UserClients userClients;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

//        String url = "http://userservice/user/"+order.getUserId();
//        User user = restTemplate.getForObject(url,User.class);

        User user = userClients.queryById(order.getUserId());
        order.setUser(user);

        // 4.返回
        return order;
    }
}
