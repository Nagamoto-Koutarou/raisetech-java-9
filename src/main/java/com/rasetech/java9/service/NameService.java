package com.rasetech.java9.service;

import com.rasetech.java9.entity.Name;

import java.util.List;

public interface NameService {
    List<Name> findAll();

    Name findById(int id);
}
