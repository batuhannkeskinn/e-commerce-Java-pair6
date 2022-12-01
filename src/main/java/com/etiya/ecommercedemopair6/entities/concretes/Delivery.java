package com.etiya.ecommercedemopair6.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private int deliveryId;

    @Column(name = "delivery_date")
    private LocalDate deliveryDate;

    @ManyToOne
    @JoinColumn(name = "shipping_company_id")
    private ShippingCompany shippingCompany;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}