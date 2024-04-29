package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DurgaprasadAuthor;
import com.example.q1.repository.DurgaprasadAuthorRepository;

@Service
public class DurgaprasadAuthorService {
    @Autowired
    private DurgaprasadAuthorRepository authorRepository;

    public DurgaprasadAuthor saveAuthor(DurgaprasadAuthor author) {
        return authorRepository.save(author);
    }

    public DurgaprasadAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<DurgaprasadAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public DurgaprasadAuthor updateAuthor(Long id, DurgaprasadAuthor author) {
        DurgaprasadAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
