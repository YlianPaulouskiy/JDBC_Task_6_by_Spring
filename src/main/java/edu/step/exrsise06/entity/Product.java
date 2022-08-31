package edu.step.exrsise06.entity;

import edu.step.exrsise06.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Product extends NameEntity {

    @Basic
    private String description;
    @Basic
    private Double price;

    //------------------------------------------------------------------------------------------------------------------

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_in_order",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"),
            foreignKey = @ForeignKey(name = "fk_orders_of_product")
    )
    List<Order> orderList;

}
