package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, String> {

}
