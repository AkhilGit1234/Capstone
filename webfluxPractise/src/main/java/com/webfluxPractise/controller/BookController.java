package com.webfluxPractise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfluxPractise.model.Book;
import com.webfluxPractise.repository.BookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookRepository repo;

@GetMapping(value="")
public Flux<Book> getAllBooks(){
	Flux<Book> count=repo.findAll();
	System.out.println(count);
	return count.log();
}
@PostMapping(value="/add")

public Mono<Book> saveBooks(@RequestBody Book book){
	Mono<Book> count=repo.save(book);
	count.subscribe((a)->{System.out.println("-------Jagan anna------"+a.getId());});
	System.out.println(count);
	return count.log();
}

@GetMapping(value="/{id}")
public Mono<Book> getBookById(@PathVariable Long id){
	Mono<Book> count=repo.findById(id);
	System.out.println(count);
	return count.log();
}
@DeleteMapping(value="/delete/{id}")
public Mono<Void> DeleteBookById(@PathVariable Long id){
	Mono<Void> deleteBook= repo.deleteById(id);
	return deleteBook;
	
}


}
