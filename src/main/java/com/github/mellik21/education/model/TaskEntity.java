package com.github.mellik21.education.model;


import com.github.mellik21.education.dto.TaskAnswerTypeEnum;
import lombok.Data;

import javax.persistence.*;

/**
 * Задача, расположенная в определенной теме
 */
@Entity
@Table(name = "task")
@Data
public class TaskEntity extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CHAPTER_ID", foreignKey = @ForeignKey(name = "TASK_2_CHAPTER"))
    private ChapterEntity chapter;
    private String title;
    private String taskText;
    private int taskIndex;
    @Enumerated(EnumType.STRING)
    private TaskAnswerTypeEnum taskAnswerType;

}

