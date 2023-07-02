package com.zahid.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, max = 20, message = "First name must be between 2 and 20 characters")
    @Pattern(regexp = "^[A-Z][a-z]*$", message = "First name must start with a capital letter")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 2, max = 20, message = "Last name must be between 2 and 20 characters")
    private String lastName;

    @Min(value = 18, message = "Age must be at least 18 years old")
    @Max(value = 25, message = "Age cannot be older than 25 years old")
    private int age;

    @NotNull(message = "Department cannot be null")
    @Enumerated(EnumType.STRING)
    private Department department;

    public enum Department {
        ME, ECE, CIVIL, CSE
    }
}
