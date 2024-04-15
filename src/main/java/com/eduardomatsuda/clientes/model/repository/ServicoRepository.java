package com.eduardomatsuda.clientes.model.repository;

import com.eduardomatsuda.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
