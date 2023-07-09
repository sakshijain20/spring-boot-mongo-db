package com.mongodb.springboot.application.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.springboot.application.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
	  List<Tutorial> findByTitleContaining(String title);
	  List<Tutorial> findByPublished(boolean published);
	}
