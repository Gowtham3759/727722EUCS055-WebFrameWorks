package com.example.cw2.controller;

import com.example.cw2.model.GowthamBook;
import com.example.cw2.service.GowthamBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class GowthamBookController {
    private final GowthamBookService bookService;

    public GowthamBookController(GowthamBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<GowthamBook> createBook(@RequestBody GowthamBook Book) {
        GowthamBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<GowthamBook>> getAllBooks() {
        List<GowthamBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public GowthamBook updateBookById(@PathVariable Long bookId,@RequestBody GowthamBook book){
        GowthamBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public GowthamBook getBookById(@PathVariable Long bookId) {
        GowthamBook book = bookService.getBookById(bookId);
        return book;
    }
}
