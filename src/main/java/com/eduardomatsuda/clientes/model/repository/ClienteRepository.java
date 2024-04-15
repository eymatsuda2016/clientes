package com.eduardomatsuda.clientes.model.repository;

import com.eduardomatsuda.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
