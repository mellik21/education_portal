package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, String> {

}
