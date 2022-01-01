package br.com.kronosys.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import br.com.kronosys.domain.Schema;

@Repository
public class SchemaDAO implements SchemaInterface 
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void salvar(Schema schema) {
		em.persist(schema);
	}

	@Override
	public Schema obter(Long chave) {
		return em.find(Schema.class, chave);
	}

	@Override
	public List<Schema> pesquisar() {
		String sql = "SELECT s.* FROM hst01_schema ";
		return em.createQuery(sql, Schema.class).getResultList();
	}
}