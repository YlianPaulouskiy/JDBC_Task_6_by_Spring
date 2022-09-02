package edu.step.exrsise06.facade;

import edu.step.exrsise06.dto.OrderDto;
import edu.step.exrsise06.dto.OrderProductsDto;

import java.util.List;

public interface OrderFacade extends CommonFacade<OrderDto> {

    OrderProductsDto findOne(Long id);

    List<OrderDto> findOrdersByPrice(Double price);

    List<OrderDto> findAll(Long productId);

    OrderProductsDto save(OrderProductsDto source);
}
