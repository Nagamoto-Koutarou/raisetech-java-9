package com.rasetech.java9.infrastructure.mapper;

import com.rasetech.java9.infrastructure.entity.Coffee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CoffeeMapper {
    List<Coffee> findAll();

    Optional<Coffee> findById(int id);

    int insert(Coffee conversionCoffee);

    void update(int id, Coffee conversionCoffee);

    void delete(int id);
}
