package edu.step.exrsise06.entity.parent;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class NameEntity extends BaseEntity{

    private String name;
}
