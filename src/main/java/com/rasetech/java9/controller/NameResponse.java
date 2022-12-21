package com.rasetech.java9.controller;

import com.rasetech.java9.entity.NameEntity;

public class NameResponse {

    private int id;
    private String name;

    public NameResponse(int id, String name) {
        this.id = id;
        this.name  = name;
    }

    public NameResponse(NameEntity name) {
        this.id = name.getId();
        this.name = name.getName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
