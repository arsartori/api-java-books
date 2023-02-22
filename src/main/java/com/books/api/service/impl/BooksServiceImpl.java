package com.books.api.service.impl;

import com.books.api.model.Books;
import com.books.api.repository.BooksRepository;
import com.books.api.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksRepository bookRepository;

    @Override
    public List<Books> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Books findByBookNumber(long bookNumber) {
        return bookRepository.findByBookNumber(bookNumber);
    }

    @Override
    public Books findByEmail(String email) {
        return bookRepository.findByEmail(email);
    }

    @Override
    public List<Books> findAllByOrderByGpaDesc() {
        return bookRepository.findAllByOrderByGpaDesc();
    }

    @Override
    public Books saveOrUpdateBook(Books book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }
}
