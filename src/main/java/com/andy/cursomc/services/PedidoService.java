package com.andy.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.cursomc.domain.Pedido;
import com.andy.cursomc.repositories.PedidoRepository;
import com.andy.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null)
			throw new ObjectNotFoundException("Objeto nao encontrado! ID: " + id + " , TIPO: " + Pedido.class.getName());
		return obj;
	}
	
}
