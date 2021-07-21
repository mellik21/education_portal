package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, String> {
}
