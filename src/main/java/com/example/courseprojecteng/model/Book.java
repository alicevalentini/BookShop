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
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Product{
    private String authorName;
    private LocalDate publicationDate;
    private String genre;
    private static List<Book> bookList = new ArrayList<>();


    public Book(String title, String description, int qty, float price, String authorName, LocalDate publicationDate, String genre) {
        super(title, description, qty, price);
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.genre = genre;
    }

    //add CRUD methods
    public void createBook(){
        bookList.add(this);
    }

    public static List<Book> getAllBooks() {
        return bookList;
    }

    public void updateBook(int i, Book updatedBook) {
        if (i >= 0 && i < bookList.size()) {
            bookList.set(i, updatedBook);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void deleteBook(int i) {
        if (i >= 0 && i < bookList.size()) {
            bookList.remove(i);
        } else {
            System.out.println("change i");
        }
    }

    public Book(String text, String text1, int i, LocalDate value, String text2, String text3) {
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", publicationDate=" + publicationDate +
                ", genre='" + genre + '\'' +
                '}';
    }

}