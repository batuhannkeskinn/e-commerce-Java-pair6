package com.etiya.ecommercedemopair6.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private int countryId;

    @Column(name="country_name")
    private String countryName;

    @OneToMany(mappedBy = "country")
    private List<Address> addresses;
}
