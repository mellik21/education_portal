package com.github.mellik21.education.repository;

import com.github.mellik21.education.model.Man;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManRepository extends CrudRepository<Man, String> {

}
