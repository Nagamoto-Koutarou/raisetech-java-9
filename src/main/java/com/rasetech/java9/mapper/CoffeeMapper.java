package com.rasetech.java9.mapper;

import com.rasetech.java9.entity.Coffee;
import com.rasetech.java9.form.CoffeeForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CoffeeMapper {
    List<Coffee> findAll();

    Optional<Coffee> findById(int id);

    void insert(CoffeeForm form);
}
