package com.mongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.models.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
	List<Tutorial> findByTitleContaining(String title);

	List<Tutorial> findByPublished(boolean published);
}