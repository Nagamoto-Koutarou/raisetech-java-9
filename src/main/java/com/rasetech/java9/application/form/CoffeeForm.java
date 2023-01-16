package com.rasetech.java9.application.form;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@AllArgsConstructor
@Getter
@Setter
public class CoffeeForm {
    private int id;

    @NotBlank
    private String productName;

    @NotBlank
    private String countryOfOrigin;

    @NotBlank
    private  String degreeOfRoasting;

    @NotNull
    @Range(min=1, max=3)
    @Positive
    private int aroma;

    @NotNull
    @Range(min=1, max=3)
    @Positive
    private int acidity;

    @NotNull
    @Range(min=1, max=3)
    @Positive
    private int bitterTaste;

    @NotNull
    @Range(min=1, max=3)
    @Positive
    private int sweetTaste;

    @NotNull
    @Range(min=1, max=3)
    @Positive
    private int rich;

    @NotNull
    @Digits(integer = 5, fraction = 2)
    @Positive
    private int priceOf100g;

    @NotNull
    @Digits(integer = 5, fraction = 2)
    @Positive
    private int priceOf200g;
}
