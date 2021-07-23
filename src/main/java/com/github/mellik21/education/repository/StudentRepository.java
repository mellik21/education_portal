package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

}
