package edu.step.exrsise06.facade.impl;

import edu.step.exrsise06.converter.OrderConverter;
import edu.step.exrsise06.converter.OrderProductConverter;
import edu.step.exrsise06.converter.ProductConverter;
import edu.step.exrsise06.dto.ProductDto;
import edu.step.exrsise06.dto.ProductOrdersDto;
import edu.step.exrsise06.entity.Product;
import edu.step.exrsise06.facade.ProductFacade;
import edu.step.exrsise06.service.OrderService;
import edu.step.exrsise06.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ProductFacadeImpl implements ProductFacade {

    private final ProductService productService;
    private final OrderConverter orderConverter;
    private final ProductConverter productConverter;
    private final OrderProductConverter converter;
    private final OrderService orderService;


    @Override
    public ProductOrdersDto findOne(Long id) {
        return converter.convert(productService.findOne(id));
    }

    @Override
    public List<ProductDto> findAll() {
        return productConverter.convertToDto(productService.findAll());
    }

    @Override
    public List<ProductDto> findAll(Long orderId) {
        return productConverter.convertToDto(orderService.findOne(orderId).getProductList());
    }

    @Override
    public ProductOrdersDto save(ProductOrdersDto source) {
        Product product = converter.convert(source);
        product.setOrderList(orderConverter.convertToModel(source.getOrders()));
        product = productService.save(product);
        ProductOrdersDto productOrdersDto = (ProductOrdersDto) productConverter.convert(product);
        productOrdersDto.setOrders(orderConverter.convertToDto(product.getOrderList()));
        return productOrdersDto;
    }

    @Override
    public void remove(Long id) {
        orderService.remove(id);
    }


}
