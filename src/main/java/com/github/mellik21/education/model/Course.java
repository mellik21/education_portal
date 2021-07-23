package com.github.mellik21.education.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "course")
@Table(name = "COURSE", schema = "EDU_PORTAL")
public class Course extends ModelEntity {
    /**
     * Курс
     */
    private Man author;
    private String title;
    private String description;
    // private List<Chapter> chapters; TODO: Нужны ли эти поля?
    // private List<Student> students;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_AUTHOR_ID", foreignKey = @ForeignKey(name = "CHAPTER_2_MAN"))
    public Man getAuthor() {
        return author;
    }

    public void setAuthor(final Man man) {
        this.author = man;
    }

    @Column(name = "TITLE", length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Column(name = "DESCRIPTION", length = 1024)
    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

}
