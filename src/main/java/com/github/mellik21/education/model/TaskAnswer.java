package com.github.mellik21.education.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "task_answer")
@Table(name = "task_answer")
@Data
public class TaskAnswer extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_TASK_ID", foreignKey = @ForeignKey(name = "TASK_ANSWER_2_TASK"))
    private Task task;
    private String answer;
    private Long score;
    private int answerIndex;

}
