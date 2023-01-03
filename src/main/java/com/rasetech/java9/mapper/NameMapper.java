package com.rasetech.java9.mapper;

import com.rasetech.java9.entity.Name;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NameMapper {
    List<Name> findAll();

    Optional<Name> findById(int id);
}
