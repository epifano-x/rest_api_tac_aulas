package br.edu.utfpr.turismoapi.controllers;

import br.edu.utfpr.turismoapi.models.Pagamento;
import br.edu.utfpr.turismoapi.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pagamento> buscarPagamentoPorId(@PathVariable UUID id) {
        return pagamentoRepository.findById(id);
    }

    @PostMapping
    public Pagamento criarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @PutMapping("/{id}")
    public Pagamento atualizarPagamento(@PathVariable UUID id, @RequestBody Pagamento pagamentoAtualizado) {
        pagamentoAtualizado.setId(id); // Certifique-se de definir o ID correto
        return pagamentoRepository.save(pagamentoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void excluirPagamento(@PathVariable UUID id) {
        pagamentoRepository.deleteById(id);
    }
}
