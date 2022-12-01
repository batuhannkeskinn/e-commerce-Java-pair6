package com.etiya.ecommercedemopair6.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Benim tarımdan set edilmedi generate value.Otomatik oluşturuldu. identity stratejisini benimsiyor
    private int productId;

    //Money'leri numeric olarak düzelt
    @Column(name = "name")
    private String name;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "stock")
    private int stock;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<CategoryProduct> categoryProductList;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    //one to many oldugunda
    //@Many(products yukarda oldugunu ıcın once o cunku many)to one(categories)
    //@JoinColumn(name="category_id")
    //private categories categories;
    //


}
