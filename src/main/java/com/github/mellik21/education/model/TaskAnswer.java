package com.github.mellik21.education.model;

import javax.persistence.*;

@Entity(name = "task_answer")
@Table(name = "TASK_ANSWER", schema = "EDU_PORTAL")
public class TaskAnswer extends ModelEntity{
    /**
     * Вариант ответа к задаче
     */
    private Task task;
    private String answer;
    private Long score;
    private int answerIndex;

    public TaskAnswer(){

    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_TASK_ID", foreignKey = @ForeignKey(name = "TASK_ANSWER_2_TASK"))
    public Task getTask() {
        return task;
    }
    public void setTask(final Task task) {
        this.task = task;
    }

    @Column(name = "ANSWER", length = 1024)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }

    @Column(name = "SCORE")
    public Long getScore() {
        return score;
    }

    public void setScore(final Long score) {
        this.score = score;
    }

    @Column(name = "ANSWER_INDEX")
    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(final int answerIndex) {
        this.answerIndex = answerIndex;
    }

}
