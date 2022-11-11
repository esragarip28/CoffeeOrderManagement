package org.example;

import org.example.service.drink.DrinkServiceImpl;
import org.example.service.order.OrderService;
import org.example.service.order.OrderServiceImpl;

public class Main {

    public static void main(String[] args) {

         OrderService orderService=new OrderServiceImpl(new DrinkServiceImpl());
         orderService.getOrder();

    }



}