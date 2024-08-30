package com.sirma_microservices.order_service.controllers;

import com.sirma_microservices.order_service.model.Order;
import com.sirma_microservices.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;


    @GetMapping
    public ResponseEntity<List<Order>> getOrders(){
        List<Order> orders = service.getAll();
        return ResponseEntity.of(Optional.ofNullable(orders));
    }

    @PostMapping("/add")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        try {
            Order create = service.create(order);
            return new ResponseEntity<>(create, HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
