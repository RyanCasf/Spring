package br.com.kronosys.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.kronosys.dao.SchemaInterface;
import br.com.kronosys.domain.Schema;

@Service @Transactional
public class SchemaServiceManager implements SchemaServiceInterface
{
	@Autowired
    private SchemaInterface sDAO;
	
	@Override
	public void salvar(Schema schema) {
		sDAO.salvar(schema);
	}

	@Override
	public Schema obter(Long chave) {
		return sDAO.obter(chave);
	}

	@Override
	public List<Schema> pesquisar() {
		return sDAO.pesquisar();
	}
}