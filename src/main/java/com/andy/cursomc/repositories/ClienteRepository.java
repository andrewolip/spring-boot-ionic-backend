package com.andy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andy.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
