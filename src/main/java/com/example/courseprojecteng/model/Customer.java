package com.example.courseprojecteng.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends User {
    private String cardNo;
    private List<Cart> myCarts = new ArrayList<>();
    private LocalDate birthDate;

    public Customer(String name, String surname, String login, String password, String cardNo, LocalDate birthDate) {
        super(name, surname, login, password);
        this.cardNo = cardNo;
        this.birthDate = birthDate;
    }

    public Customer(String name, String surname, String login, String password) {
        super(name, surname, login, password);
    }

    @Override
    public String toString() {
        return "login: " + login;
    }

}