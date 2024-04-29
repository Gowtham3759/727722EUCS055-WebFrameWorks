package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GowthamAuthor;
import com.example.q1.model.GowthamBook;
import com.example.q1.repository.GowthamAuthorRepository;
import com.example.q1.repository.GowthamBookRepository;

@Service
public class GowthamBookService {
    @Autowired
    private GowthamBookRepository bookRepository;
@Autowired
private GowthamAuthorRepository authorRepository;
    public GowthamBook saveBook(Long authorId, GowthamBook book) {
        GowthamAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public GowthamBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

