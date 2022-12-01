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
@Table(name = "colors")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="color_id")
    private int colorId;

    @Column(name = "color_name")
    private String colorName;

    @OneToMany(mappedBy = "color")
    private List<ProductInfo> productInfos;
}
