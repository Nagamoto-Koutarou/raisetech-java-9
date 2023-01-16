package com.rasetech.java9.domain.service;

import com.rasetech.java9.infrastructure.entity.Coffee;
import com.rasetech.java9.application.form.CoffeeForm;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface CoffeeService {
    List<Coffee> findAll();

    Coffee findById(int id);

    void register(@Validated CoffeeForm form, BindingResult result);

    void delete(int id);
}
