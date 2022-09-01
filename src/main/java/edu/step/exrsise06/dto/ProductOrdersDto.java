package edu.step.exrsise06.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductOrdersDto extends ProductDto {

    List<OrderDto> orders;
}
