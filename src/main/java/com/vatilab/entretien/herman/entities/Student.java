package com.vatilab.entretien.herman.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
