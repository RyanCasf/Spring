package br.com.kronosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kronosys.domain.Schema;

@Repository
public interface CourseRepository extends JpaRepository<Schema, Long> 
{
	
}