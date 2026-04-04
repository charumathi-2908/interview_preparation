package com.example.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.Entity.billing;

public interface billingrepository extends JpaRepository<billing, Integer> {
}