package com.example.billing.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.billing.Entity.product;
import com.example.billing.Repository.productrepository;

@Service
public class productservice {

    @Autowired
    private productrepository prepo;

    public product save(product p) {
        return prepo.save(p);
    }

    public List<product> getAll() {
        return prepo.findAll();
    }

    public product getById(int id) {
        return prepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        prepo.deleteById(id);
    }
}