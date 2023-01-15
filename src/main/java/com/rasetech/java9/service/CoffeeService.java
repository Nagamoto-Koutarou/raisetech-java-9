package com.rasetech.java9.service;

import com.rasetech.java9.entity.Coffee;
import com.rasetech.java9.form.CoffeeForm;

import java.util.List;

public interface CoffeeService {
    List<Coffee> findAll();

    Coffee findById(int id);

    void register(CoffeeForm form);

    void delete(int id);
}
