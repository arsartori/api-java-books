package com.books.api.repository;

import com.books.api.model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BooksRepository extends MongoRepository<Books, String> {

    Books findByBookNumber(long bookNumber);

    Books findByEmail(String email);

    List<Books> findAllByOrderByGpaDesc();

}
