package br.com.tdd.TDD.modules.repository;

import br.com.tdd.TDD.modules.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseJPARepository extends JpaRepository<Course, Long> {

    Course findByTitle(String title);
}