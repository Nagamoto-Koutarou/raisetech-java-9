package com.rasetech.java9.service;

import com.rasetech.java9.entity.Name;
import com.rasetech.java9.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService{

    private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }

    @Override
    public Name findById(int id) {
        Optional<Name> idForName = nameMapper.findById(id);
        return idForName.orElseThrow();
    }
}
