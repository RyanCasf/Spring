package br.com.tdd.TDD.modules.service;

import br.com.tdd.TDD.modules.interfaces.CourseRepositoryInterface;
import br.com.tdd.TDD.modules.interfaces.CourseServiceInterface;
import br.com.tdd.TDD.modules.model.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements CourseServiceInterface {

    private CourseRepositoryInterface courseRepository;

    public CourseService(CourseRepositoryInterface courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course execute(Course course) {
        Course temp = courseRepository.findByTitle(course.getTitle());

        if (temp != null) {
            throw new IllegalArgumentException("Course exists");
        }

        return courseRepository.save(course);
    }
}