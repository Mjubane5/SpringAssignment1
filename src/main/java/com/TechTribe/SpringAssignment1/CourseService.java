package com.TechTribe.SpringAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // CREATE or UPDATE a course
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    // READ all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // READ a single course by its ID
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    // DELETE a course
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}