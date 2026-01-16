package com.example.courseprojecteng.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Shop implements Serializable {
    private List<User> user;
    private List<Product> products;

    public Shop() {
        this.user = new ArrayList<>();
        this.products = new ArrayList<>();
    }
}