package com.webfluxPractise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfluxPractise.model.Book;
import com.webfluxPractise.model.Question;
import com.webfluxPractise.repository.QuestionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	
	@Autowired
	QuestionRepository repo;
	
	@GetMapping(value="")
	public Flux<Question> getAllBooks(){
		Flux<Question> count=repo.findAll();
		System.out.println(count);
		return count.log();
	}

	@PostMapping(value="/add")

	public Mono<Question> saveBooks(@RequestBody Question question){
		
		System.out.println("------- anna------"+question.getId());
		Mono<Question> count=repo.save(question);
		count.subscribe((a)->{System.out.println("-------Jagan anna------"+a.getId());});
		System.out.println(count);
		return count.log();
	}
	
}
