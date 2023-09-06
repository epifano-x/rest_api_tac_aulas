package br.edu.utfpr.turismoapi.repositories;

import br.edu.utfpr.turismoapi.models.Passeio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PasseioRepository extends JpaRepository<Passeio, UUID> {

}
