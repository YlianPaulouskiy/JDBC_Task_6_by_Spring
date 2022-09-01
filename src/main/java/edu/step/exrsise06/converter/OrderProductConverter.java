package edu.step.exrsise06.converter;

import edu.step.exrsise06.converter.uses.DateTimeMapper;
import edu.step.exrsise06.dto.OrderProductsDto;
import edu.step.exrsise06.dto.ProductOrdersDto;
import edu.step.exrsise06.entity.Order;
import edu.step.exrsise06.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {
        DateTimeMapper.class,
        OrderConverter.class,
        ProductConverter.class
})
public interface OrderProductConverter {

    @WithProducts
    @Mapping(source = "productList", target = "products")
    OrderProductsDto convert(Order order);

    @Mapping(source = "products", target = "productList")
    Order convert(OrderProductsDto source);

    @WithOrders
    @Mapping(source = "orderList", target = "orders")
    ProductOrdersDto convert(Product product);

    @Mapping(source = "orders", target = "orderList")
    Product convert(ProductOrdersDto source);

}
