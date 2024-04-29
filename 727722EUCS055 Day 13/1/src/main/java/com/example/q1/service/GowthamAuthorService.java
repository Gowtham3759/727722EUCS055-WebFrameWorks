package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GowthamAuthor;
import com.example.q1.repository.GowthamAuthorRepository;

@Service
public class GowthamAuthorService {
    @Autowired
    private GowthamAuthorRepository authorRepository;

    public GowthamAuthor saveAuthor(GowthamAuthor author) {
        return authorRepository.save(author);
    }

    public GowthamAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<GowthamAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public GowthamAuthor updateAuthor(Long id, GowthamAuthor author) {
        GowthamAuthor existingAuthor = authorRepository.findById(id).orElse(null);
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
