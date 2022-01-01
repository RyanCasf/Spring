package br.com.kronosys.service;

import java.util.List;
import br.com.kronosys.domain.Schema;

public interface SchemaServiceInterface
{
	public void salvar(Schema Schema);
	public Schema obter(Long chave);
   	public List<Schema> pesquisar();
}