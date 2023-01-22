package com.rasetech.java9.domain.service;

import com.rasetech.java9.infrastructure.entity.Coffee;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface CoffeeService {
    List<Coffee> findAll();

    Coffee findById(int id);

    Coffee register(Coffee conversionCoffee, BindingResult result);

    void update(int id, Coffee conversionCoffee, BindingResult result);

    void delete(int id);
}
