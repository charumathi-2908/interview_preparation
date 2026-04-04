package com.example.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.billing.Entity.product;
import com.example.billing.Service.productservice;

@RestController
@RequestMapping("/product")
public class productcontroller {

    @Autowired
    private productservice pservice;

    @PostMapping("/add")
    public product add(@RequestBody product p) {
        return pservice.save(p);
    }

    @GetMapping
    public List<product> getAll() {
        return pservice.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        pservice.delete(id);
        return "Product deleted";
    }
}