package br.com.kronosys.Spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.kronosys.domain.Schema;
import br.com.kronosys.repository.CourseRepository;

@RestController @RequestMapping("/api/schemas")
public class VerificacaoBackupController 
{
	@Autowired
	private CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Schema> list() {
    	if (courseRepository != null) {
    		return courseRepository.findAll();
    	}
    	return null;
    }
}