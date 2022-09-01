package edu.step.exrsise06.converter;

import edu.step.exrsise06.converter.uses.DateTimeMapper;
import edu.step.exrsise06.dto.OrderDto;
import edu.step.exrsise06.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {
        DateTimeMapper.class//даем ссылку на какой класс сылаться для конверта даты в строку и наоборот}
})
public interface OrderConverter {

    Order convert(OrderDto orderDto);

    OrderDto convert(Order order);

}
