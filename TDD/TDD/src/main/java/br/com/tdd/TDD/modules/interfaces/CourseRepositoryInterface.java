package br.com.tdd.TDD.modules.interfaces;

import br.com.tdd.TDD.modules.model.Course;

public interface CourseRepositoryInterface {

    Course findByTitle(String title);
    Course save(Course course);
}