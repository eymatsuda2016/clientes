package br.com.eduardomatsuda.model.repository;

import br.com.eduardomatsuda.model.enty.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
