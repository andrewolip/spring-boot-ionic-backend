package com.andy.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.andy.cursomc.domain.Categoria;
import com.andy.cursomc.repositories.CategoriaRepository;
import com.andy.cursomc.services.exceptions.DataIntegrityException;
import com.andy.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null)
			throw new ObjectNotFoundException(
					"Objeto nao encontrado! ID: " + id + " , TIPO: " + Categoria.class.getName());
		return obj;
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.delete(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Nao e possivel excluir uma Categoria que possui Produtos");
		}
	}

}
