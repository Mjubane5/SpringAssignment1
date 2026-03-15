package com.TechTribe.SpringAssignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CourseController {

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
}