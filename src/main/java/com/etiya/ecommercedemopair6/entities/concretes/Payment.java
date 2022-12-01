package com.etiya.ecommercedemopair6.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "card_number")
    private int cardNumber;

    @ManyToOne
    @JoinColumn(name= "order_id")
    private Order order;


}
