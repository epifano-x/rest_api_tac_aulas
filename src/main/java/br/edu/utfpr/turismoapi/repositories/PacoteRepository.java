package br.edu.utfpr.turismoapi.repositories;

import br.edu.utfpr.turismoapi.models.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PacoteRepository extends JpaRepository<Pacote, UUID> {

}
