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
@Table(name= "streets")
public class Street {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="street_id")
    private int streetId;

    @Column(name="street_name")
    private String streetName;

    @Column(name="city_id")
    private int cityName;

    @OneToMany(mappedBy = "street")
    private List<Address> addresses;

}
