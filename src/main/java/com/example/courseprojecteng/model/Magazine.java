package com.example.courseprojecteng.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Magazine extends Product{

    private LocalDate publicationDate;
    private static List<Magazine> magazineList = new ArrayList<>();

    public Magazine(String title, String description, int qty, float price, LocalDate publicationDate) {
        super(title, description, qty, price);
        this.publicationDate = publicationDate;
    }

    public Magazine(String text, String text1, LocalDate value, String text2) {
    }

    public void createMagazine(){
        magazineList.add(this);
    }

    public static List<Magazine> getAllBooks() {
        return magazineList;
    }

    public void updateMagazine(int i, Magazine updatedMagazine) {
        if (i >= 0 && i < magazineList.size()) {
            magazineList.set(i, updatedMagazine);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void deleteMagazine(int i) {
        if (i >= 0 && i < magazineList.size()) {
            magazineList.remove(i);
        } else {
            System.out.println("change i");
        }
    }
}