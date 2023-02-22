package com.books.api.controller;

import com.books.api.dto.BooksDTO;
import com.books.api.model.Books;
import com.books.api.service.BooksService;
import com.books.api.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksRestController {

    @Autowired
    private BooksService bookService;

    @GetMapping(value = "/")
    public List<BooksDTO> getAllBooks() {
        return ObjectMapperUtils.mapAll(bookService.findAll(), BooksDTO.class);
    }

    @GetMapping(value = "/byBookNumber/{bookNumber}")
    public BooksDTO getBookByBookNumber(@PathVariable("bookNumber") Long bookNumber) {
        return ObjectMapperUtils.map(bookService.findByBookNumber(bookNumber), BooksDTO.class);
    }

    @GetMapping(value = "/byEmail/{email}")
    public BooksDTO getBookByEmail(@PathVariable("email") String email) {
        return ObjectMapperUtils.map(bookService.findByEmail(email), BooksDTO.class);
    }

    @GetMapping(value = "/orderByGpa")
    public List<BooksDTO> findAllByOrderByGpaDesc() {
        return ObjectMapperUtils.mapAll(bookService.findAllByOrderByGpaDesc(), BooksDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateBook(@RequestBody BooksDTO bookDTO) {
        bookService.saveOrUpdateBook(ObjectMapperUtils.map(bookDTO, Books.class));
        return new ResponseEntity("Book added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{bookNumber}")
    public ResponseEntity<?> deleteBookByBookNumber(@PathVariable long bookNumber) {
        bookService.deleteBookById(bookService.findByBookNumber(bookNumber).getId());
        return new ResponseEntity("Book deleted successfully", HttpStatus.OK);
    }

}
