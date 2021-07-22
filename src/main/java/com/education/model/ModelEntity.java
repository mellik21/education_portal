package com.education.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public class ModelEntity {
    protected  Long id;
    protected LocalDateTime createdWhen;
    protected LocalDateTime updatedWhen;

    public ModelEntity() {
    }

    public ModelEntity(Long id, LocalDateTime createdWhen, LocalDateTime updatedWhen) {
        this.id = id;
        this.createdWhen = createdWhen;
        this.updatedWhen = updatedWhen;
    }

    @Id
    @Column(
            name = "id"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ID_GEN"
    )
    @SequenceGenerator(
            name = "ID_GEN",
            sequenceName = "id_sequence",
            allocationSize = 1
    )
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(
            name = "CREATED_WHEN",
            columnDefinition = "TIMESTAMP NOT NULL DEFAULT now()",
            updatable = false
    )
    public LocalDateTime getCreatedWhen() {
        return this.createdWhen;
    }

    public void setCreatedWhen(LocalDateTime createdWhen) {
        this.createdWhen = createdWhen;
    }

    @Column(
            name = "UPDATED_WHEN",
            columnDefinition = "TIMESTAMP NOT NULL DEFAULT now()"
    )
    public LocalDateTime getUpdatedWhen() {
        return this.updatedWhen;
    }

    public void setUpdatedWhen(LocalDateTime updatedWhen) {
        this.updatedWhen = updatedWhen;
    }
}