package edu.step.exrsise06.controller.rest.impl;

import edu.step.exrsise06.controller.rest.OrderController;
import edu.step.exrsise06.dto.OrderDto;
import edu.step.exrsise06.dto.OrderProductsDto;
import edu.step.exrsise06.facade.OrderFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderControllerImpl implements OrderController {

    private final OrderFacade orderFacade;

    @Override
    public OrderProductsDto findOne(Long id) {
        return orderFacade.findOne(id);
    }

    @Override
    public List<OrderDto> findAll(Long productId) {
        return productId == null ?
                orderFacade.findAll() :
                orderFacade.findAll(productId);
    }

    @Override
    public OrderProductsDto save(OrderProductsDto source) {
        return orderFacade.save(source);
    }

    @Override
    public void remove(Long id) {
        orderFacade.remove(id);
    }
}
