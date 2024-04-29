package com.example.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.DurgaprasadAuthor;
import com.example.q1.model.DurgaprasadBook;
import com.example.q1.service.DurgaprasadAuthorService;
import com.example.q1.service.DurgaprasadBookService;

@RestController
public class DurgaprasadAuthorController {
    @Autowired
    private DurgaprasadAuthorService authorService;
@Autowired
private DurgaprasadBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<DurgaprasadAuthor> createAuthor(@RequestBody DurgaprasadAuthor author) {
        DurgaprasadAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<DurgaprasadBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody DurgaprasadBook book) {
        DurgaprasadBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<DurgaprasadAuthor> getAuthorById(@PathVariable Long authorId) {
        DurgaprasadAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<DurgaprasadAuthor>> getAllAuthors() {
        List<DurgaprasadAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<DurgaprasadAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody DurgaprasadAuthor author) {
        DurgaprasadAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
