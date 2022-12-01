package com.etiya.ecommercedemopair6.entities.concretes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="product_infos")
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_info_id")
    private int productInfoId;


    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name="size_id")
    private Size size;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;




    //brand_id
    //color_id
    //size_id
    //product_id

}
