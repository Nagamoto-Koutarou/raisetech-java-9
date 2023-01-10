package com.rasetech.java9.controller;

import com.rasetech.java9.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CoffeeController {
    private final CoffeeService coffeeService;

    @GetMapping("/coffees")
    public List<CoffeeResponse> getCoffees() {
        return coffeeService.findAll().stream().map(CoffeeResponse::new).toList();
    }

    @GetMapping("/coffees/{id}")
    public CoffeeResponse findById(@PathVariable int id) {
        return new CoffeeResponse(coffeeService.findById(id));
    }
}
