package br.edu.utfpr.turismoapi.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.turismoapi.models.Person;
import br.edu.utfpr.turismoapi.respositories.PersonRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/pessoa")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    /**
     * obter todas as pessoas do seu banco
     */
    @GetMapping(value = { "", "/" })
    public String getAll() {
        return "aqui estao todas as pessoas ";
    }

    /**
     * obter 1 pessoas do seu banco
     */
    @GetMapping(value = { "/{id}" })
    public String getById(@PathVariable Long id) {
        return "aqui esta a pessoa " + id;
    }

    /**
     * cria um usuario
     */
    @PostMapping(value = "")
    public Person create() {
        var pes = new Person();
        pes.setNome("juca da silva");
        pes.setEmail("juca@gmail.com");
        pes.setNascimento(LocalDateTime.now());

        personRepository.save(pes);

        return pes;
    }

    /**
     * atualiza o usuario
     */
    @PutMapping("/{id}")
    public String update(@PathVariable Long id) {
        return "pessoa" + id + "atualizada";
    }

    /**
     * deleta usuario
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return "pessoa " + id + " deletada";
    }

}
