package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

import java.util.Date;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book getBookDetails() {
        // Creating a book object with the given details
        Book book = new Book("The Great Soldier", "G. Gyan", new Date());
        return book;
    }
}