package com.example.courseprojecteng.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class
Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Product> productList;
    @ManyToOne
    private Customer customer;
    @ManyToMany
    private Manager manager;

    public <E> Cart(ArrayList<E> es, Customer buyer) {
    }

    public <E> List<E> getProductList() {
        return null;
    }

    public User getManager() {
        return null;
    }

    public User getCustomer() {
        return null;
    }
}