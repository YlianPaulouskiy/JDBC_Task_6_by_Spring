package edu.step.exrsise06.dto.parent;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public abstract class BaseDto implements Serializable {

    private Long id;
    private String lastModified;
    private String dateCreation;
    private long version;
}
