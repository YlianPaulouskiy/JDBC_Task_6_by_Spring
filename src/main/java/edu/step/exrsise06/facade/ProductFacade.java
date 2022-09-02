package edu.step.exrsise06.facade;

import edu.step.exrsise06.dto.ProductDto;
import edu.step.exrsise06.dto.ProductOrdersDto;

import java.util.List;

public interface ProductFacade extends CommonFacade<ProductDto> {

    ProductOrdersDto findOne(Long id);

    List<ProductDto> findAll(Long orderId);

    ProductOrdersDto save(ProductOrdersDto source);

}
