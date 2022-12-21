package com.rasetech.java9.entity;

public class NameEntity {
    private int id;
    private String name;

    public NameEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
