package com.etiya.ecommercedemopair6.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "baskets")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private int basketId;

    @OneToMany(mappedBy = "basket")
    private List<BasketDetail> basketDetails;

    //customer_id

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
}
