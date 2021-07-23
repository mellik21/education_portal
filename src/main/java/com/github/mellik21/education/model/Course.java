package com.github.mellik21.education.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Курс
 */
@Entity
@Table(name = "course")
@Data
public class Course extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_AUTHOR_ID", foreignKey = @ForeignKey(name = "CHAPTER_2_MAN"))
    private Man author;
    private String title;
    private String description;
    // private List<Chapter> chapters; TODO: Нужны ли эти поля?
    // private List<Student> students;

}
