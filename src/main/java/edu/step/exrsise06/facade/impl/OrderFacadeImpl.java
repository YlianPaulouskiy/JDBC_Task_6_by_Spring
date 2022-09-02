package edu.step.exrsise06.facade.impl;

import edu.step.exrsise06.converter.OrderConverter;
import edu.step.exrsise06.converter.OrderProductConverter;
import edu.step.exrsise06.converter.ProductConverter;
import edu.step.exrsise06.dto.OrderDto;
import edu.step.exrsise06.dto.OrderProductsDto;
import edu.step.exrsise06.entity.Order;
import edu.step.exrsise06.facade.OrderFacade;
import edu.step.exrsise06.service.OrderService;
import edu.step.exrsise06.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class OrderFacadeImpl implements OrderFacade {

    private final OrderService orderService;
    private final OrderConverter orderConverter;
    private final ProductConverter productConverter;
    private final OrderProductConverter converter;
    private final ProductService productService;

    @Override
    public OrderProductsDto findOne(Long id) {
        return converter.convert(orderService.findOne(id));
    }

    @Override
    public List<OrderDto> findAll() {
        return orderConverter.convertToDto(orderService.findAll());
    }

    @Override
    public List<OrderDto> findAll(Long productId) {
        return orderConverter.convertToDto(productService.findOne(productId).getOrderList());
    }

    @Override
    public List<OrderDto> findOrdersByPrice(Double price) {
        return orderConverter.convertToDto(orderService.findOrdersByPrice(price));
    }

    @Override
    public OrderProductsDto save(OrderProductsDto entity) {
        Order order = orderConverter.convert(entity);
        order.setProductList(productConverter.convertToModel(entity.getProducts()));
        order = orderService.save(order);
        OrderProductsDto orderProductsDto = (OrderProductsDto) orderConverter.convert(order);
        orderProductsDto.setProducts(productConverter.convertToDto(order.getProductList()));
        return orderProductsDto;
    }

    @Override
    public void remove(Long id) {
        orderService.remove(id);
    }

}
