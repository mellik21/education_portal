package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskEntity, String> {

}
