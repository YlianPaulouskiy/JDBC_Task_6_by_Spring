package edu.step.exrsise06.controller.rest;

import edu.step.exrsise06.dto.OrderDto;
import edu.step.exrsise06.dto.OrderProductsDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface OrderController {

    @GetMapping()
    OrderProductsDto findOne(@RequestParam("id") Long id);

    @GetMapping("/all")
    List<OrderDto> findAll(@RequestParam(name = "productId", required = false) Long productId);

    @PostMapping("/save")
    OrderProductsDto save(@RequestBody OrderProductsDto source);

    @DeleteMapping("/remove")
    void remove(Long id);
}
