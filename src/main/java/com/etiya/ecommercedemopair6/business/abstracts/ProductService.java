package com.etiya.ecommercedemopair6.business.abstracts;

import com.etiya.ecommercedemopair6.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);


}
