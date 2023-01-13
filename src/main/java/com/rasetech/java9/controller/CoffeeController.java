package com.rasetech.java9.controller;

import com.rasetech.java9.form.CoffeeForm;
import com.rasetech.java9.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.ZonedDateTime;
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
        if (result.hasErrors()) {

            Map<String, String> body = Map.of(
                    "timestamp", ZonedDateTime.now().toString(),
                    "status", String.valueOf(HttpStatus.BAD_REQUEST.value()),
                    "error", HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    "message", "create failed",
                    "path", "/coffees"
            );
            return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
        }
        coffeeService.register(form);
        URI url = uriComponentsBuilder.path("/coffees")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "coffee successfully create" ));
    }
}
