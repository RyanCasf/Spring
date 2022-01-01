package br.com.kronosys.dao;

import java.util.List;
import br.com.kronosys.domain.Schema;

public interface SchemaInterface
{
	public void salvar(Schema meta);
	public Schema obter(Long chave);
	
	public List<Schema> pesquisar();
}