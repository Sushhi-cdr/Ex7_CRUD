package com.example.Ex7.Controllers;

import com.example.Ex7.Models.Fornecedor;
import com.example.Ex7.Services.ServicoFornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fornecedores")
public class controleFornecedor {

    @Autowired
    private ServicoFornecedor servico;

    @PostMapping
    public Fornecedor criar(@RequestBody Fornecedor fornecedor){
        return servico.criar(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Fornecedor buscar(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        servico.deletar(id);
    }
}
