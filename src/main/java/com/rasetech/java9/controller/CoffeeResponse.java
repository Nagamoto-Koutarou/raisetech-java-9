package com.rasetech.java9.controller;

import com.rasetech.java9.entity.Coffee;
import lombok.Getter;

@Getter
public class CoffeeResponse {

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
