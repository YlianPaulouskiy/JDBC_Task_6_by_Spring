package edu.step.exrsise06.dto;

import edu.step.exrsise06.dto.parent.NameDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends NameDto {

    private String description;
    private Double price;

}
