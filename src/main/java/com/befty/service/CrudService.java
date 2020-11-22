package com.befty.service;

import java.util.List;

public interface CrudService<T, ID> {

    List<T> findAll();
    T findByID(ID id);
    void delete (T object);
    void deleteBY(ID id);
    T save(T object);

}
