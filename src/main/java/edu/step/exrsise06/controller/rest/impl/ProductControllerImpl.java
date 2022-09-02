package edu.step.exrsise06.controller.rest.impl;

import edu.step.exrsise06.controller.rest.ProductController;
import edu.step.exrsise06.dto.ProductDto;
import edu.step.exrsise06.dto.ProductOrdersDto;
import edu.step.exrsise06.facade.ProductFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductControllerImpl implements ProductController {

    private final ProductFacade productFacade;

    @Override
    public ProductOrdersDto findOne(Long id) {
        return productFacade.findOne(id);
    }

    @Override
    public List<ProductDto> findAll(Long orderId) {
        return orderId == null ?
                productFacade.findAll() :
                productFacade.findAll(orderId);
    }

    @Override
    public ProductOrdersDto save(ProductOrdersDto source) {
        return productFacade.save(source);
    }

    @Override
    public void remove(Long id) {
        productFacade.remove(id);
    }
}
