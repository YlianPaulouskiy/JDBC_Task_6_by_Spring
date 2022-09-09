package edu.step.exrsise06.controller.rest;

import edu.step.exrsise06.dto.ProductDto;
import edu.step.exrsise06.dto.ProductOrdersDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {

    @GetMapping("/find")
    ProductOrdersDto findOne(@RequestParam("id") Long id);

    @GetMapping("/all")
    List<ProductDto> findAll(@RequestParam(name = "orderId", required = false) Long orderId);

    @PostMapping("/save")
    ProductOrdersDto save(@RequestBody ProductOrdersDto source);

    @DeleteMapping("/remove")
    void remove(@RequestParam("id") Long id);
}
