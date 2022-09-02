package edu.step.exrsise06.converter;

import edu.step.exrsise06.converter.uses.DateTimeMapper;
import edu.step.exrsise06.dto.ProductDto;
import edu.step.exrsise06.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        DateTimeMapper.class
})
public interface ProductConverter {

    Product convert(ProductDto productDto);

    ProductDto convert(Product product);

    List<Product> convertToModel(List<ProductDto> source);

    List<ProductDto> convertToDto(List<Product> source);

}
