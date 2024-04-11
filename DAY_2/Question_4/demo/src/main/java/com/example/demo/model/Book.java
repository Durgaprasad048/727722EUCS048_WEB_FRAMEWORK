package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class Book {
    private String title;
    private String author;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public Book() {
        // Default constructor
    }

    public Book(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}