package com.github.mellik21.education.model;


import com.github.mellik21.education.dto.TaskAnswerTypeEnum;

import javax.persistence.*;

@Entity(name = "task")
@Table(name = "TASK", schema = "EDU_PORTAL")
public class Task extends ModelEntity {
    /**
     * Задача, расположенная в определенной теме
     */
    private Chapter chapter;
    private String title;
    private String taskText;
    private int taskIndex;
    private TaskAnswerTypeEnum taskAnswerType;

    public Task() {

    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CHAPTER_ID", foreignKey = @ForeignKey(name = "TASK_2_CHAPTER"))
    public Chapter getChapter() {
        return chapter;
    }
    public void setChapter(final Chapter chapter) {
        this.chapter = chapter;
    }

    @Column(name = "TITLE", length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Column(name = "TASK_TEXT", length = 1024)
    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(final String taskText) {
        this.taskText = taskText;
    }

    @Column(name = "TASK_INDEX")
    public int getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(final int taskIndex) {
        this.taskIndex = taskIndex;
    }

    //TODO: does it mapped to string in table correctly?
    @Column(name = "TASK_ANSWER_TYPE", length = 1024)
    public TaskAnswerTypeEnum getTaskAnswerType() {
        return taskAnswerType;
    }

    public void setTaskAnswerType(final TaskAnswerTypeEnum taskAnswerType) {
        this.taskAnswerType = taskAnswerType;
    }
}

