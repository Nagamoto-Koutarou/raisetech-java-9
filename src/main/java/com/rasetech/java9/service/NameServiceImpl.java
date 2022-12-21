package com.rasetech.java9.service;

import com.rasetech.java9.entity.NameEntity;
import com.rasetech.java9.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService{

    private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<NameEntity> findAll() {
        return nameMapper.findAll();
    }
}
