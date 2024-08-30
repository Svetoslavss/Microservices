package com.sirma_microservices.order_service.service;

import com.sirma_microservices.order_service.model.Order;
import com.sirma_microservices.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    @Autowired
    private OrderRepository repository;

    public List<Order> getAll(){
        return repository.findAll();
    }

    public Order create(Order order){
        return repository.save(order);
    }
}
