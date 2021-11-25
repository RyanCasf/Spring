package br.com.ryan.dao;

import java.util.List;
import br.com.ryan.domain.Meta;

public interface MetaInterface
{
	public void salvar(Meta meta);
	public Meta obter(Long chave);
	
	public List<Meta> pesquisar(
		Long chave,
		String titulo,
		String descricao,
		boolean excluido);
}