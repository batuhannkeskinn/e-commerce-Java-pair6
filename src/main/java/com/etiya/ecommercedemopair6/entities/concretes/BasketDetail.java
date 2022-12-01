package com.etiya.ecommercedemopair6.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "basket_details")
public class BasketDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_detail_id")
    private int basketDetailId;

    @Column(name="quantity")
    private String quantity;

    //basket_id
    @ManyToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;

    //productId

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
