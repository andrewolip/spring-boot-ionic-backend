package com.andy.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.cursomc.domain.Categoria;
import com.andy.cursomc.repositories.CategoriaRepository;
import com.andy.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null)
			throw new ObjectNotFoundException("Objeto nao encontrado! ID: " + id + " , TIPO: " + Categoria.class.getName());
		return obj;
	}
	
}
