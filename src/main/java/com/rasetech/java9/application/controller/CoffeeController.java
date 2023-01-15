package com.rasetech.java9.application.controller;

import com.rasetech.java9.application.form.CoffeeForm;
import com.rasetech.java9.domain.service.CoffeeService;
import lombok.RequiredArgsConstructor;
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
        coffeeService.register(form, result);
        URI url = uriComponentsBuilder.path("/coffees")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "coffee successfully create" ));
    }

    @PatchMapping
    public ResponseEntity<Map<String, String>> patch(@RequestBody @Validated CoffeeForm form, BindingResult result) {
        coffeeService.update(form, result);
        return ResponseEntity.ok(Map.of("message", "coffee successfully update"));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id")int id) {
        coffeeService.delete(id);
        return ResponseEntity.ok(Map.of("message", "coffee successfully delete"));
    }
}
