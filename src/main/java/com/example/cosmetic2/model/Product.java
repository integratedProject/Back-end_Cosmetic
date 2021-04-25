package com.example.cosmetic2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    private String productId;
    private String productName;
    private String productImage;
    private double price;

    @Column(name = "launch_date")
    private Date launchDate;
    private String description;
    @JoinColumn(name = "brand_brandid")
    @ManyToOne
    private Brand brandId;
}
