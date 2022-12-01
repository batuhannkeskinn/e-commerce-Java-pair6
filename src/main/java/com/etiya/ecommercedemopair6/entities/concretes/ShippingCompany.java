package com.etiya.ecommercedemopair6.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data //Getter Setter yerine karşılıyor
@Table(name = "shipping_companies")
public class ShippingCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shipping_company_id")
    private int shippingCompanyId;

    @Column(name="company_name")
    private String companyName;

    @OneToMany(mappedBy = "shippingCompany")
    private List<Delivery> deliveries;
}