package com.gf.apiInvestimento.repository;

import com.gf.apiInvestimento.model.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
}
