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
@Table(name="categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String types;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<CategoryProduct> categoryProductList;

    /*many to one için
    @OneToMany(mappedby= "category")
    private List<Product> products
    Json ignore?
    json ignore properties? o alanın içindeki bir özelliği ignore et.


     */
}
