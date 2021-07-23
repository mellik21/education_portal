package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.Chapter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, String> {

}
