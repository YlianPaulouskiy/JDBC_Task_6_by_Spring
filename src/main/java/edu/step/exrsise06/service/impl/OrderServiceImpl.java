package edu.step.exrsise06.service.impl;

import edu.step.exrsise06.entity.Order;
import edu.step.exrsise06.repository.OrderRepository;
import edu.step.exrsise06.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository repository;

    @Override
    public Order findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Not found order by id = " + id)
        );
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Order> findOrdersByPrice(Double price) {
        return repository.findOrdersByPrice(price);
    }

    @Override
    public Order save(Order entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }


}
