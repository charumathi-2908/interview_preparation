package com.example.billing.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billingid;
    @ManyToOne
    @JoinColumn(name="customerid")
    private customer customerid;
    @Column(name="total")
    private double total;
}