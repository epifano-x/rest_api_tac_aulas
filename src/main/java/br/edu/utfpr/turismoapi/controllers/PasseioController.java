package br.edu.utfpr.turismoapi.controllers;

import br.edu.utfpr.turismoapi.models.Passeio;
import br.edu.utfpr.turismoapi.repositories.PasseioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/passeios")
public class PasseioController {
    @Autowired
    private PasseioRepository passeioRepository;

    @GetMapping
    public List<Passeio> listarPasseios() {
        return passeioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Passeio> buscarPasseioPorId(@PathVariable UUID id) {
        return passeioRepository.findById(id);
    }

    @PostMapping
    public Passeio criarPasseio(@RequestBody Passeio passeio) {
        return passeioRepository.save(passeio);
    }

    @PutMapping("/{id}")
    public Passeio atualizarPasseio(@PathVariable UUID id, @RequestBody Passeio passeioAtualizado) {
        passeioAtualizado.setId(id); 
        return passeioRepository.save(passeioAtualizado);
    }

    @DeleteMapping("/{id}")
    public void excluirPasseio(@PathVariable UUID id) {
        passeioRepository.deleteById(id);
    }
}
