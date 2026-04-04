package com.example.billing.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.billing.Entity.billing;
import com.example.billing.Repository.billingrepository;

@Service
public class billingservice {

    @Autowired
    private billingrepository brepo;

    public billing save(billing b) {
        return brepo.save(b);
    }

    public List<billing> getAll() {
        return brepo.findAll();
    }
    public billing update(int id) {
        return brepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        brepo.deleteById(id);
    }
}