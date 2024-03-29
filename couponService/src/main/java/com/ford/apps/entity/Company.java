package com.ford.apps.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;
    private String companyName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company" )
    private List<Coupon> coupon;

}

