package com.rasetech.java9.service;

import com.rasetech.java9.entity.NameEntity;

import java.util.List;

public interface NameService {
    List<NameEntity> findAll();
}
