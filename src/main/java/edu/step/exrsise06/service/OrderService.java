package edu.step.exrsise06.service;

import edu.step.exrsise06.entity.Order;

import java.util.List;

public interface OrderService extends CommonService<Order> {

    List<Order> findOrdersByPrice(Double price);
}
