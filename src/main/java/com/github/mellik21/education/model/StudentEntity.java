package com.github.mellik21.education.model;

import javax.persistence.*;
import java.util.List;

/**
 * Студент конкретного курса, его успехи и выбранные ответы
 */
@Entity
@Table(name = "student")
public class StudentEntity extends ManEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_COURSE_ID")
    private CourseEntity course;
    private int score;

    @OneToMany
    @JoinTable(name = "STUDENT_ANSWERS", schema = "EDU_PORTAL",
            joinColumns = {@JoinColumn(
                    name = "FK_STUDENT_ID",
                    foreignKey = @ForeignKey(name = "STUDENT_ANSWERS_2_STUDENT")
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "FK_TASK_ANSWER_ID",
                    foreignKey = @ForeignKey(name = "STUDENT_ANSWERS_2_TASK_ANSWER")
            )}
    )
    private List<TaskAnswer> taskAnswers;

}
