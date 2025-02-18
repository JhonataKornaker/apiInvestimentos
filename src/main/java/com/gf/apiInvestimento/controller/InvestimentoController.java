package com.gf.apiInvestimento.controller;

import com.gf.apiInvestimento.model.Investimento;
import com.gf.apiInvestimento.service.InvestimentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/investimentos")
@CrossOrigin(origins = "*")
public class InvestimentoController {

    @Autowired
    private InvestimentoService service;

    @GetMapping
    public List<Investimento> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investimento> buscarPorId(@PathVariable Long id) {
        Optional<Investimento> investimento = service.buscarPorId(id);
        return investimento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Investimento> cadastrar(@RequestBody @Valid Investimento investimento) {
        Investimento salvo = service.salvar(investimento);
        System.out.println("Investimento salvo: " + salvo);

        return ResponseEntity.ok(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investimento> atualizar(@PathVariable Long id, @Valid @RequestBody Investimento investimento) {
        return ResponseEntity.ok(service.atualizar(id, investimento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
