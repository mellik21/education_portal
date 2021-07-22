package com.education.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "student")
@Table(name = "STUDENT", schema = "EDU_PORTAL")
public class Student extends Man {
    /**
     * Студент конкретного курса, его успехи и выбранные ответы
     */
    private Course course;
    private Long score;
    private List<TaskAnswer> taskAnswers;

    public Student(){

    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_COURSE_ID", foreignKey = @ForeignKey(name = "CHAPTER_2_COURSE"))
    public Course getCourse() {
        return course;
    }
    public void setCourse(final Course course){
        this.course = course;
    }

    @Column(name = "SCORE")
    public Long getScore() {
        return score;
    }
    public void setScore(Long score) {
        this.score = score;
    }

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
    public List<TaskAnswer> getTaskAnswers() {
        return this.taskAnswers;
    }

    public void setTaskAnswers(final List<TaskAnswer> taskAnswers) {
        this.taskAnswers = taskAnswers;
    }
}
