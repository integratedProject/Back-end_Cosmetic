package com.example.cosmetic2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_color")
public class ProductColor implements Serializable {

    @Id
    @JoinColumn(name = "colorid")
    @ManyToOne
    private Color colorId;

    @Id
    @JoinColumn(name = "productid")
    @ManyToOne
    private Product productId;
}
