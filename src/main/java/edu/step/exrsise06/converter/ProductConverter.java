package edu.step.exrsise06.converter;

import edu.step.exrsise06.converter.uses.DateTimeMapper;
import edu.step.exrsise06.dto.ProductDto;
import edu.step.exrsise06.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring"
//        , uses = {
//        DateTimeMapper.class}
)
public interface ProductConverter {

    Product convert(ProductDto productDto);

    ProductDto convert(Product product);

}
