package br.edu.utfpr.turismoapi.respositories;

import org.springframework.stereotype.Repository;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.utfpr.turismoapi.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {

}
