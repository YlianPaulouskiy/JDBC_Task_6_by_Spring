package edu.step.exrsise06.repository;

import edu.step.exrsise06.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "select o from Order o where (select sum(p.price) from Product p) < :price")
    List<Order> findOrdersByPrice(Double price);

}
