package com.rasetech.java9.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Coffee {
    private int id;
    private String productName;
    private String countryOfOrigin;
    private  String degreeOfRoasting;
    private int aroma;
    private int acidity;
    private int bitterTaste;
    private int sweetTaste;
    private int rich;
    private int priceOf100g;
    private int priceOf200g;
}
