package com.example.courseprojecteng.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stationery extends Product{
    private String brandPen;
    private StationeryType stationeryType;
    private static List<Stationery> penList = new ArrayList<>();
    public Stationery(String title, String description, int qty, float price, String brandPen, StationeryType stationeryType) {
        super(title, description, qty, price);
        this.brandPen = brandPen;
        this.stationeryType = stationeryType;
    }

    public void createPen(){
        penList.add(this);
    }

    public static List<Stationery> getAllPen() {
        return penList;
    }

    public void updatePen(int i, Stationery updatePen) {
        if (i >= 0 && i < penList.size()) {
            penList.set(i, updatePen);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void deletePen(int i) {
        if (i >= 0 && i < penList.size()) {
            penList.remove(i);
        } else {
            System.out.println("change i");
        }
    }



}