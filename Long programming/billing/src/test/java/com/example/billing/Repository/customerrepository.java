package com.example.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.Entity.customer;

public interface customerrepository extends JpaRepository<customer, Integer> {
}