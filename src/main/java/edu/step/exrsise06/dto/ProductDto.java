package edu.step.exrsise06.dto;

import edu.step.exrsise06.dto.parent.NameDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDto extends NameDto {

    private String description;
    private Double price;
    private List<OrderDto> orders;
}
