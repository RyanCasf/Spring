package br.com.tdd.TDD.modules.repository;

import br.com.tdd.TDD.modules.interfaces.CourseRepositoryInterface;
import br.com.tdd.TDD.modules.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRepository implements CourseRepositoryInterface {

    @Autowired
    private CourseJPARepository repository;

    @Override
    public Course findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public Course save(Course course) {
        return repository.save(course);
    }
}