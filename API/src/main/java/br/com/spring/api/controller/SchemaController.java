package br.com.spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.api.model.Schema;
import br.com.spring.api.repository.SchemaRepository;

@RestController
@RequestMapping("/schemas")
public class SchemaController 
{
	@Autowired
	private SchemaRepository sDAO;
	
	@GetMapping
	public List<Schema> listar() {
		return sDAO.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Schema salvar(@RequestBody Schema schema) {
		return sDAO.save(schema);
	}
}