package com.github.mellik21.education.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "person")
@Data
public class PersonEntity extends BaseEntity{

    String fullName;
    String firstName;
    String secondaryName;
    String lastName;

    LocalDate birthdate;

}
