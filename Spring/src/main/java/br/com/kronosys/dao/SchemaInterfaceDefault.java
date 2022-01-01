package br.com.kronosys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.kronosys.domain.Schema;

@Repository
public interface SchemaInterfaceDefault extends JpaRepository<Schema, Long>
{
	
}