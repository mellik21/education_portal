package com.github.mellik21.education.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "chapter")
@Data
public class ChapterEntity extends BaseEntity {
    /**
     * Подтема курса
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_COURSE_ID")
    private CourseEntity course;

    private String title;

    private String description;

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
    private List<TaskEntity> tasks;

}
