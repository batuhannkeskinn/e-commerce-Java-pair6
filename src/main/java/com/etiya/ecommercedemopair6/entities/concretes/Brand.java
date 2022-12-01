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
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private int basketId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<ProductInfo> productInfos;

}
