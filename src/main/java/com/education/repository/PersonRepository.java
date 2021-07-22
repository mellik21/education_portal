package com.education.repository;

import com.education.model.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, String> {
}
