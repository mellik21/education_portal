package com.github.mellik21.education.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "man")
@Table(name = "man")
@Data
public class Man extends BaseEntity {
    /**
     * Основная информация о любом человеке (кроме логина, пароля и др)
     */
    private String phone;
    private String email;
    //firstname lastname secondname ?
    private String surname;
    private String name;
    private String patronymic;
    private Date birthDay;

}
