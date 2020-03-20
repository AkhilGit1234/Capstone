package com.webfluxPractise.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.webfluxPractise.model.Question;

public interface QuestionRepository extends ReactiveCrudRepository<Question, Long> {

}
