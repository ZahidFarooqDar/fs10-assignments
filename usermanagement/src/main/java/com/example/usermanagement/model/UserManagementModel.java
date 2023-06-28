package com.example.usermanagement.model;

import java.time.LocalDate;
// import java.time.LocalDateTime;
import java.time.LocalTime;

// import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_table")
public class UserManagementModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Pattern(regexp = "^\\w{3,}$", message = "Username must be at least 3 characters long and contain only alphanumeric characters and underscores.")
    private String userName;
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Date of birth must be in the format DD-MM-YYYY.")
    private String dateOfBirth;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email address.")
    private String mail;
    @Pattern(regexp = "^\\d{2}\\d{10}$", message = "Phone number must be 12 digits long and start with a two-digit country code.")
    private String phoneNumber;
    private LocalDate date;
    private LocalTime time;
}
