package edu.step.exrsise06.service.impl;

import edu.step.exrsise06.entity.Product;
import edu.step.exrsise06.repository.ProductRepository;
import edu.step.exrsise06.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    @Override
    public Product findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Not found entity by id = " + id)
        );
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product save(Product entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
