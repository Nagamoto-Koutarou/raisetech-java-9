package com.rasetech.java9.domain.service;

import com.rasetech.java9.domain.exception.BadRequestException;
import com.rasetech.java9.domain.exception.ResourceNotFoundException;
import com.rasetech.java9.infrastructure.entity.Coffee;
import com.rasetech.java9.infrastructure.mapper.CoffeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

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
        return this.coffeeMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }

    @Override
    public void register(Coffee coffee, BindingResult result) {
        if (result.hasErrors()) {
            throw new BadRequestException("bad request");
        }
        coffeeMapper.insert(coffee);
    }

    @Override
    public void update(int id, Coffee coffee, BindingResult result) {
        if (result.hasErrors()) {
            throw new BadRequestException("bad request");
        }
        coffeeMapper.update(id, coffee);
    }

    @Override
    public void delete(int id) {
        coffeeMapper.delete(id);
    }
}
