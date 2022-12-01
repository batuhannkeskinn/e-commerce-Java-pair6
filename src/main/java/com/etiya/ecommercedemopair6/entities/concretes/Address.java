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
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;

    @Column(name="title")
    private String title;

    @OneToMany(mappedBy = "address")
    private List<Customer> customers;

    //street_id
    @ManyToOne
    @JoinColumn(name ="street_id")
    private Street street;

    //city_id
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    //country_id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
