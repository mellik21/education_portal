package com.github.mellik21.education.model;

import javax.persistence.*;
import java.sql.Timestamp;

@MappedSuperclass
public class ModelEntity {
    protected  Long id;
    protected Timestamp createdWhen;
    protected Timestamp updatedWhen;

    public ModelEntity() {
    }

    public ModelEntity(Long id, Timestamp createdWhen, Timestamp updatedWhen) {
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
    public Timestamp getCreatedWhen() {
        return this.createdWhen;
    }

    public void setCreatedWhen(Timestamp createdWhen) {
        this.createdWhen = createdWhen;
    }

    @Column(
            name = "UPDATED_WHEN",
            columnDefinition = "TIMESTAMP NOT NULL DEFAULT now()"
    )
    public Timestamp getUpdatedWhen() {
        return this.updatedWhen;
    }

    public void setUpdatedWhen(Timestamp updatedWhen) {
        this.updatedWhen = updatedWhen;
    }
}