package br.com.ryan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ryan.dao.MetaInterface;
import br.com.ryan.domain.Meta;

@Service
@Transactional
public class MestaServiceManager implements MetaServiceInterface
{
	@Autowired
    private MetaInterface mDAO;
	
	@Override
	public void salvar(Meta meta) 
	{
		mDAO.salvar(meta);
	}

	@Override
	public Meta obter(Long chave) 
	{
		return mDAO.obter(chave);
	}

	@Override
	public List<Meta> pesquisar(Long chave, String titulo, String descricao, boolean excluido) 
	{
		return mDAO.pesquisar(chave, titulo, descricao, excluido);
	}
}