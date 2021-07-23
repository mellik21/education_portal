package com.github.mellik21.education.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "chapter")
@Table(name = "CHAPTER", schema = "EDU_PORTAL")
public class Chapter extends ModelEntity {
    /**
     * Подтема курса
     */
    private Course course;
    private String title;
    private String description;
    private List<Task> tasks;

    public Chapter(){

    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_COURSE_ID", foreignKey = @ForeignKey(name = "CHAPTER_2_COURSE"))
    public Course getCourse() {
        return course;
    }
    public void setCourse(final Course course){
        this.course = course;
    }

    @Column(name = "TITLE", length = 1024)
    public String getTitle() {
        return title;
    }
    public void setTitle(final String title){
        this.title = title;
    }

    @Column(name = "DESCRIPTION", length = 1024)
    public String getDescription() {
        return description;
    }
    public void setDescription(final String description){
        this.description = description;
    }

    @OneToMany
    @JoinTable(name = "CHAPTER_TASKS", schema = "EDU_PORTAL",
            joinColumns = {@JoinColumn(
                    name = "FK_CHAPTER_ID",
                    foreignKey = @ForeignKey(name = "CHAPTER_TASKS_2_CHAPTER")
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "FK_TASK_ID",
                    foreignKey = @ForeignKey(name = "CHAPTER_TASKS_2_TASK")
            )}
    )
    public List<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(final List<Task> tasks) {
        this.tasks = tasks;
    }

}
