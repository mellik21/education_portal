package com.github.mellik21.education.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "task_answer")
@Data
public class TaskAnswer extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_TASK_ID")
    private TaskEntity task;
    private String answer;
    private int score;
    private int answerIndex;

}
