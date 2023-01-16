package com.rasetech.java9.infrastructure.mapper;

import com.rasetech.java9.application.form.CoffeeForm;
import com.rasetech.java9.infrastructure.entity.Coffee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CoffeeMapper {
    List<Coffee> findAll();

    Optional<Coffee> findById(int id);

    void insert(CoffeeForm form);

    void delete(int id);
}
