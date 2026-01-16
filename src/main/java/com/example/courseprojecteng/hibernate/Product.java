package com.example.courseprojecteng.hibernate;

import com.example.courseprojecteng.model.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String productTitle;
    private String productDescription;
    private int quantity;
    private float weight;
    private LocalDate datePlanted;
    private LocalDate dataCreated;

    public void setCart(Cart cart) {
    }

    public <E> List<E> getComments() {
        return null;
    }
}
