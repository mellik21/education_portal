package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    @Query("SELECT c FROM Course c WHERE c.title=:searchQuery OR c.description=:searchQuery")
    List<Course> search(@Param("searchQuery") String searchQuery);

}
