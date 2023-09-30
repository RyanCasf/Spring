package br.com.tdd.TDD.service;

import br.com.tdd.TDD.modules.model.Course;
import static org.junit.jupiter.api.Assertions.*;

import br.com.tdd.TDD.modules.service.CourseService;
import br.com.tdd.TDD.repository.CourseInMemoryRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CourseServiceTest {

    @Test
    void save() {
        Course course = new Course();
        course.setTitle("Test course title A");
        course.setDescription("Test course description A");
        course.setWorkloadHour(8l);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        CourseService courseService = new CourseService(repository);
        Course createdCourse = courseService.execute(course);

        assertNotNull(createdCourse.getId());
    }
}