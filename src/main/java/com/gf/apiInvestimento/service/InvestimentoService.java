package com.gf.apiInvestimento.service;

import com.gf.apiInvestimento.model.Investimento;
import com.gf.apiInvestimento.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestimentoService {

    @Autowired
    private InvestimentoRepository repository;

    public List<Investimento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Investimento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Investimento salvar(Investimento investimento) {
        return repository.save(investimento);
    }

    public Investimento atualizar(Long id, Investimento investimentoAtualizado) {
        return repository.findById(id).map(investimento -> {
            investimento.setNome(investimentoAtualizado.getNome());
            investimento.setTipo(investimentoAtualizado.getTipo());
            investimento.setValor(investimentoAtualizado.getValor());
            investimento.setData(investimentoAtualizado.getData());
            return repository.save(investimento);
        }).orElseThrow(() -> new RuntimeException("Investimento não encontrado"));
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
