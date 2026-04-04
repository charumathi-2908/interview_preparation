package com.example.billing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.billing.Entity.billing;
import com.example.billing.Service.billingservice;

@RestController
@RequestMapping("/billing")
public class billingcontroller {

    @Autowired
    private billingservice bservice;

    @PostMapping("/add")
    public billing add(@RequestBody billing b) {
        return bservice.save(b);
    }

    @GetMapping
    public List<billing> getAll() {
        return bservice.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        bservice.delete(id);
        return "Billing deleted";
    }
}