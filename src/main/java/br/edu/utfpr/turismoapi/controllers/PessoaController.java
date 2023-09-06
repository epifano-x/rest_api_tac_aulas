package br.edu.utfpr.turismoapi.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.turismoapi.models.Pessoa;
import br.edu.utfpr.turismoapi.repositories.PessoaRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;

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
    public Pessoa create() {
        var pes = new Pessoa();
        pes.setNome("juca da silva");
        pes.setEmail("juca@gmail.com");
        pes.setNascimento(LocalDateTime.now());

        pessoaRepository.save(pes);

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
