package com.example.courseprojecteng.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commentTitle;
    private String commentBody;
    private LocalDate dateCreated;
    private User commentOwner;
    private List<Comment> replies;
    private float rating;

    public Comment(String commentTitle, String commentBody, LocalDate dateCreated, User commentOwner, List<Comment> replies, float rating) {
        this.commentTitle = commentTitle;
        this.commentBody = commentBody;
        this.dateCreated = dateCreated;
        this.commentOwner = commentOwner;
        this.replies = replies;
        this.rating = rating;
    }

    public Collection<Object> getReplies() {
        return null;
    }

    public User getOwner() {
        return null;
    }

    public User getProduct() {
        return null;
    }
}