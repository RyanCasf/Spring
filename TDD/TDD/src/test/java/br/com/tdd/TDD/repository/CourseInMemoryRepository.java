package br.com.tdd.TDD.repository;

import br.com.tdd.TDD.modules.interfaces.CourseRepositoryInterface;
import br.com.tdd.TDD.modules.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseInMemoryRepository implements CourseRepositoryInterface {

    private List<Course> courses = new ArrayList<>();

    @Override
    public Course findByTitle(String title) {
        return courses.stream()
                .filter(c -> c.getTitle().equals(title)).findFirst()
                .orElse(null);
    }

    @Override
    public Course save(Course course) {
        course.setId(courses.isEmpty() ? 1l : courses.get(courses.size() - 1).getId() + 1l);

        courses.add(course);
        return course;
    }
}