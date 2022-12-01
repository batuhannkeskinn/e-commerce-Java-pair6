package com.etiya.ecommercedemopair6.business.concretes;

import com.etiya.ecommercedemopair6.business.abstracts.ProductService;
import com.etiya.ecommercedemopair6.entities.concretes.Product;
import com.etiya.ecommercedemopair6.repository.abstracts.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//?
@Service
public class ProductManager implements ProductService {
    //dependency injection
    private ProductRepository productRepository;

    //Spring IoC (inversion on control?) autowired kullanıldı
    @Autowired
    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    @Override
    public List<Product> getAll() {

        return productRepository.findAll();

    }

    @Override
    public Product getById(int id) {
        return productRepository.findById(id).orElseThrow();
    }
}
