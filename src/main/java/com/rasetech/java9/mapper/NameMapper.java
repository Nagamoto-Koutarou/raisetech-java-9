package com.rasetech.java9.mapper;

import com.rasetech.java9.entity.NameEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NameMapper {
    List<NameEntity> findAll();
}
