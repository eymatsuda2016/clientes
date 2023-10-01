package br.com.eduardomatsuda.model.repository;

import br.com.eduardomatsuda.model.enty.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
