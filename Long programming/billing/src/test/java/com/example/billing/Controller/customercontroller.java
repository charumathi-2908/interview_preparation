package com.example.billing.Controller;

import com.example.billing.Entity.customer;
import com.example.billing.Service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class customercontroller {



        @Autowired
        private customerservice cservice;

        @PostMapping("/add")
        public customer add(@RequestBody customer c) {
            return cservice.save(c);
        }

        @GetMapping
        public List<customer> getAll() {
            return cservice.getAll();
        }

        @DeleteMapping("/{id}")
        public String delete(@PathVariable int id) {
           cservice.delete(id);
            return "Customer deleted";
        }
    }
}
