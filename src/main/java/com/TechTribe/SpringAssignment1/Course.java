package com.TechTribe.SpringAssignment1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Course name cannot be empty")
    private String name;

    @Min(value = 1, message = "Credits must be at least 1")
    private int credits;

    @NotBlank(message = "Category is required")
    private String category;

    // Constructors
    public Course() {}

    public Course(String name, int credits, String category) {
        this.name = name;
        this.credits = credits;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}