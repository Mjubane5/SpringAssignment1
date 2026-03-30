package com.TechTribe.SpringAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses/info")
    public Map<String, List<String>> getCourseInfo() {
        Map<String, List<String>> departmentCourses = new HashMap<>();

        // 2 Foundation courses
        departmentCourses.put("Foundation", Arrays.asList(
                "CSC111: Introduction to Computing",
                "CSC112: IT Fundamentals"
        ));

        // 5 Undergraduate courses
        departmentCourses.put("Undergraduate", Arrays.asList(
                "CSC211: Object-Oriented Programming",
                "CSC212: Data Structures",
                "CSC311: Operating Systems",
                "CSC312: Database Systems",
                "CSC313: Software Engineering"
        ));

        // 4 Honours courses
        departmentCourses.put("Honours", Arrays.asList(
                "CSC411: Advanced Artificial Intelligence",
                "CSC412: Cyber Security",
                "CSC413: Parallel Computing",
                "CSC414: Research Methodology"
        ));

        return departmentCourses;

    }

    // CREATE: Add a new course [cite: 40]
    @PostMapping("/courses")
    public Course createCourse(@Valid @RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    // READ: Get all courses [cite: 40]
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // READ: Get a specific course by ID [cite: 40]
    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id).orElse(null);
    }
    // UPDATE: Modify an existing course [cite: 40]
    @PutMapping("/courses/{id}")
    public Course updateCourse(@PathVariable Long id, @Valid  @RequestBody Course updatedCourse) {
        return courseService.getCourseById(id).map(course -> {
            course.setName(updatedCourse.getName());
            course.setCredits(updatedCourse.getCredits());
            course.setCategory(updatedCourse.getCategory());
            return courseService.saveCourse(course);
        }).orElse(null);
    }

    // DELETE: Remove a course [cite: 40]
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}