package com.example.billing.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.billing.Entity.customer;
import com.example.billing.Repository.customerrepository;

@Service
public class customerservice {

    @Autowired
    private customerrepository crepo;

    public customer save(customer c) {
        return crepo.save(c);
    }

    public List<customer> getAll() {
        return crepo.findAll();
    }

    public customer getById(int id) {
        return crepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        crepo.deleteById(id);
    }
}
