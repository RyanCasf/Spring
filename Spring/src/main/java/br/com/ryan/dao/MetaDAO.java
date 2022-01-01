package br.com.ryan.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import br.com.ryan.domain.Meta;

@Repository
public class MetaDAO implements MetaInterface
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void salvar(Meta meta) {
		em.persist(meta);
	}

	@Override
	public Meta obter(Long chave) {
		return em.find(Meta.class, chave);
	}

	@Override
	public List<Meta> pesquisar(Long chave, String titulo, String descricao, boolean excluido) {
		String sql = "SELECT m FROM meta ";
		return em.createQuery(sql, Meta.class).getResultList();
	}
}