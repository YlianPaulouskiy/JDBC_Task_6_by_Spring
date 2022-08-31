package edu.step.exrsise06.service;

import java.util.List;

public interface CommonService<T> {

    T findOne(Long id);

    List<T> findAll();

    T save(T entity);

    void remove(Long id);

}
