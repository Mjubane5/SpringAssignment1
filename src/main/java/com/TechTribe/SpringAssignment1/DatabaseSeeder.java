package com.TechTribe.SpringAssignment1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final CourseRepository courseRepository;

    public DatabaseSeeder(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Only seed if the database is empty
        if (courseRepository.count() == 0) {
            Course c1 = new Course("CSC111", 16, "Foundation");
            Course c2 = new Course("CSC211", 12, "Undergraduate");
            Course c3 = new Course("CSC412", 16, "Honours");

            courseRepository.saveAll(Arrays.asList(c1, c2, c3));
            System.out.println("✅ Database successfully seeded with default University courses!");
        }
    }
}