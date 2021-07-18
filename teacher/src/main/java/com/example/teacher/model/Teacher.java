package com.example.teacher.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class Teacher {
    @Id
    private int id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String designation;
}
