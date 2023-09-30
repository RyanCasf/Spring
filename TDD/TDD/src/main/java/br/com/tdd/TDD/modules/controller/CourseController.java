package br.com.tdd.TDD.modules.controller;

import br.com.tdd.TDD.modules.model.Course;
import br.com.tdd.TDD.modules.repository.CourseRepository;
import br.com.tdd.TDD.modules.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @PostMapping("/")
    public Course create(@RequestBody Course course) {
        CourseService service = new CourseService(repository);
        return service.execute(course);
    }
}