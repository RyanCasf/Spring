package br.com.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.api.model.Schema;

@Repository
public interface SchemaRepository extends JpaRepository<Schema, Long>
{
	
}