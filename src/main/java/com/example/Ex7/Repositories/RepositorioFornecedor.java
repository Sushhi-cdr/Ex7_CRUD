package com.example.Ex7.Repositories;

import com.example.Ex7.Models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFornecedor extends JpaRepository<Fornecedor, Long> {
}
