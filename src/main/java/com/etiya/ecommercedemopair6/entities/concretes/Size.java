package com.etiya.ecommercedemopair6.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="sizes")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private int sizeId;

    @Column(name = "number")
    private String number;

    @OneToMany(mappedBy = "size")
    private List<ProductInfo> productInfoList;
}
