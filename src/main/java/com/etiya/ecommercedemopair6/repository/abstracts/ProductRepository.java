package com.etiya.ecommercedemopair6.repository.abstracts;
//bu interface in veri erişim katmanı olması için alması gereken extends

import com.etiya.ecommercedemopair6.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
