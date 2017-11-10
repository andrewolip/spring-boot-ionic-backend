package com.andy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andy.cursomc.domain.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Integer>{

}
