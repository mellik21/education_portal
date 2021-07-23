package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

    @Query("")
    List<Course> search(@Param("searchQuery") String searchQuery);

}
