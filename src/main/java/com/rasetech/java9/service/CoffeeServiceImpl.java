package com.rasetech.java9.service;

import com.rasetech.java9.entity.Coffee;
import com.rasetech.java9.mapper.CoffeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeMapper coffeeMapper;

    @Override
    public List<Coffee> findAll() {
        return coffeeMapper.findAll();
    }

    @Override
    public Coffee findById(int id) {
        Optional<Coffee> idForCoffee = coffeeMapper.findById(id);
        return idForCoffee.orElseThrow();
    }
}
