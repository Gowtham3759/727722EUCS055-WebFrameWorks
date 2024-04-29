package com.example.cw2.service;

import com.example.cw2.model.GowthamBook;
import com.example.cw2.repository.GowthamBookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GowthamBookService {
    private final GowthamBookRepo bookRepo;

    public GowthamBookService(GowthamBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public GowthamBook createBook(GowthamBook Book) {
        return bookRepo.save(Book);
    }
    public List<GowthamBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public GowthamBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public GowthamBook updateBookById(Long id,GowthamBook book){
        GowthamBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
