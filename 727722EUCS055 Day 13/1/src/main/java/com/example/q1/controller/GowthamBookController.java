package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.GowthamBook;
import com.example.q1.service.GowthamBookService;

@RestController
public class GowthamBookController {
    @Autowired
    private GowthamBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<GowthamBook> getBookById(@PathVariable Long bookId) {
        GowthamBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
