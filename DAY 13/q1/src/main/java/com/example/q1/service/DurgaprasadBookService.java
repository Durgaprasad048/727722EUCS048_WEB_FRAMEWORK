package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DurgaprasadAuthor;
import com.example.q1.model.DurgaprasadBook;
import com.example.q1.repository.DurgaprasadAuthorRepository;
import com.example.q1.repository.DurgaprasadBookRepository;

@Service
public class DurgaprasadBookService {
    @Autowired
    private DurgaprasadBookRepository bookRepository;
@Autowired
private DurgaprasadAuthorRepository authorRepository;
    public DurgaprasadBook saveBook(Long authorId, DurgaprasadBook book) {
        DurgaprasadAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public DurgaprasadBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

