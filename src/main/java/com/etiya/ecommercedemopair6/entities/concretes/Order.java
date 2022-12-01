package com.etiya.ecommercedemopair6.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_number")
    private  int orderNumber;

    @Column(name = "order_quantity")
    private int orderQuantity;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<Delivery> deliveries;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "order")
    private List<Payment> payments;
}
