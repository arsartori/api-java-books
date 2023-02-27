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
    private BooksService booksService;

    @GetMapping(value = "/")
    public List<BooksDTO> getAllBooks() {
        return ObjectMapperUtils.mapAll(booksService.findAll(), BooksDTO.class);
    }

    @GetMapping(value = "/byBookNumber/{bookNumber}")
    public BooksDTO getBookByBookNumber(@PathVariable("bookNumber") Long bookNumber) {
        return ObjectMapperUtils.map(booksService.findByBookNumber(bookNumber), BooksDTO.class);
    }

    @GetMapping(value = "/byEmail/{email}")
    public BooksDTO getBookByEmail(@PathVariable("email") String email) {
        return ObjectMapperUtils.map(booksService.findByEmail(email), BooksDTO.class);
    }

    @GetMapping(value = "/orderByGpa")
    public List<BooksDTO> findAllByOrderByGpaDesc() {
        return ObjectMapperUtils.mapAll(booksService.findAllByOrderByGpaDesc(), BooksDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateBook(@RequestBody BooksDTO booksDTO) {
        booksService.saveOrUpdateBook(ObjectMapperUtils.map(booksDTO, Books.class));
        return new ResponseEntity("Book added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{bookNumber}")
    public ResponseEntity<?> deleteBookByBookNumber(@PathVariable long bookNumber) {
        booksService.deleteBookById(booksService.findByBookNumber(bookNumber).getId());
        return new ResponseEntity("Book deleted successfully", HttpStatus.OK);
    }

}
