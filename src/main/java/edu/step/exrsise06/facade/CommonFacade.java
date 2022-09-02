package edu.step.exrsise06.facade;

import java.util.List;

public interface CommonFacade<T> {

    List<T> findAll();

    void remove(Long id);
}
