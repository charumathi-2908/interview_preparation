package com.example.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.Entity.product;

public interface productrepository extends JpaRepository<product, Integer> {
}