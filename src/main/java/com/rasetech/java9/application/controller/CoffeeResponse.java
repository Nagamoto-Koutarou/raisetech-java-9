package com.rasetech.java9.application.controller;

import com.rasetech.java9.infrastructure.entity.Coffee;
import lombok.Getter;

@Getter
public class CoffeeResponse {

    private final int id;
    private final String productName;
    private final String countryOfOrigin;
    private final String degreeOfRoasting;
    private final int aroma;
    private final int acidity;
    private final int bitterTaste;
    private final int sweetTaste;
    private final int rich;
    private final int priceOf100g;
    private final int priceOf200g;

    public CoffeeResponse(Coffee coffee) {
        this.id = coffee.getId();
        this.productName = coffee.getProductName();
        this.countryOfOrigin = coffee.getCountryOfOrigin();
        this.degreeOfRoasting = coffee.getDegreeOfRoasting();
        this.aroma = coffee.getAroma();
        this.acidity = coffee.getAcidity();
        this.bitterTaste = coffee.getBitterTaste();
        this.sweetTaste = coffee.getSweetTaste();
        this.rich = coffee.getRich();
        this.priceOf100g = coffee.getPriceOf100g();
        this.priceOf200g = coffee.getPriceOf200g();
    }
}
