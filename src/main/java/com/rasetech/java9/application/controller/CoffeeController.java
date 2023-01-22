package com.rasetech.java9.application.controller;

import com.rasetech.java9.application.form.CoffeeForm;
import com.rasetech.java9.domain.service.CoffeeService;
import com.rasetech.java9.infrastructure.entity.Coffee;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RequestMapping("/coffees")
@RequiredArgsConstructor
@RestController
public class CoffeeController {
    private final CoffeeService coffeeService;

    @GetMapping
    public List<CoffeeResponse> getCoffees() {
        return coffeeService.findAll().stream().map(CoffeeResponse::new).toList();
    }

    @GetMapping("/{id}")
    public CoffeeResponse findById(@PathVariable int id) {
        return new CoffeeResponse(coffeeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> create(@RequestBody @Validated CoffeeForm form, BindingResult result, UriComponentsBuilder uriComponentsBuilder) {
        ModelMapper modelMapper1 = new ModelMapper();
        Coffee conversionCoffee = modelMapper1.map(form, Coffee.class);
        Coffee coffee = coffeeService.register(conversionCoffee, result);
        URI url = uriComponentsBuilder.path("/coffees/" + coffee.getId())
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "coffee successfully create" ));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, String>> patch(@PathVariable("id")int id, @RequestBody @Validated CoffeeForm form, BindingResult result, UriComponentsBuilder uriComponentsBuilder) {
        ModelMapper modelMapper = new ModelMapper();
        Coffee conversionCoffee = modelMapper.map(form, Coffee.class);
        coffeeService.update(id, conversionCoffee, result);
        URI url = uriComponentsBuilder.path("/coffees/" + id)
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "coffee successfully update"));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id")int id) {
        coffeeService.delete(id);
        return ResponseEntity.ok(Map.of("message", "coffee successfully delete"));
    }
}
