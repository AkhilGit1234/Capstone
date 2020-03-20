package com.webfluxPractise.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.webfluxPractise.model.Book;


public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
 
}
