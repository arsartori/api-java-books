package com.books.api.service;

import com.books.api.model.Books;

import java.util.List;

public interface BooksService {

    List<Books> findAll();

    Books findByBookNumber(long bookNumber);

    Books findByEmail(String email);

    List<Books> findAllByOrderByGpaDesc();

    Books saveOrUpdateBook(Books book);

    void deleteBookById(String id);

}
