package br.edu.utfpr.turismoapi.controllers;

import br.edu.utfpr.turismoapi.models.Pacote;
import br.edu.utfpr.turismoapi.repositories.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    @Autowired
    private PacoteRepository pacoteRepository;

    @GetMapping
    public List<Pacote> listarPacotes() {
        return pacoteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pacote> buscarPacotePorId(@PathVariable UUID id) {
        return pacoteRepository.findById(id);
    }

    @PostMapping
    public Pacote criarPacote(@RequestBody Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    @PutMapping("/{id}")
    public Pacote atualizarPacote(@PathVariable UUID id, @RequestBody Pacote pacoteAtualizado) {
        pacoteAtualizado.setId(id); // Certifique-se de definir o ID correto
        return pacoteRepository.save(pacoteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void excluirPacote(@PathVariable UUID id) {
        pacoteRepository.deleteById(id);
    }
}
