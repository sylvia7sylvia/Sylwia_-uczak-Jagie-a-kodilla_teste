
package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks(List<BookDto> booksList) {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @DeleteMapping()
    public void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }

    @DeleteMapping(value = "/{index}/")
    public void removeBookByIndex(@PathVariable int index) {
        bookService.removeBookByIndex(index);
    }
}