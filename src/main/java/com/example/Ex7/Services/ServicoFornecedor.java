package com.example.Ex7.Services;

import com.example.Ex7.Models.Fornecedor;
import com.example.Ex7.Repositories.RepositorioFornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoFornecedor {

    @Autowired
    private RepositorioFornecedor repositorio;

    public Fornecedor criar(Fornecedor fornecedor) {
        return repositorio.save(fornecedor);
    }

    public List<Fornecedor> listar() {
        return repositorio.findAll();
    }

    public Fornecedor buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
