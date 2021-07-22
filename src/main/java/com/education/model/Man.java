package com.education.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "man")
@Table(name = "MAN", schema = "EDU_PORTAL")
public class Man extends ModelEntity {
    /**
     * Основная информация о любом человеке (кроме логина, пароля и др)
     */
    private String phone;
    private String email;
    //firstname lastname secondname ?
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthDay;

    public Man() {
    }

    @Column(name = "PHONE", length = 10)
    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    @Column(name = "EMAIL", length = 20)
    public String getEMail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Column(name = "SURNAME", length = 10)
    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Column(name = "NAME", length = 10)
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Column(name = "PATRONYMIC", length = 10)
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(final String patronymic) {
        this.patronymic = patronymic;
    }

    @Column(name = "BIRTH_DATE", length = 10)
    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(final LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}