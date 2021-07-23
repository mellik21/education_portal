package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.TaskAnswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskAnswerRepository extends CrudRepository<TaskAnswer, String> {

}

