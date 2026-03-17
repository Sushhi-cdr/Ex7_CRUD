package com.example.Ex7.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fantasiaFornecedor")
    private String fantasiaFornecedor;

    @Column(name = "CNPJFornecedor")
    private String cnpjFornecedor;

    private String contatoFornecedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFantasiaFornecedor() {
        return fantasiaFornecedor;
    }

    public void setFantasiaFornecedor(String fantasiaFornecedor) {
        this.fantasiaFornecedor = fantasiaFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        this.contatoFornecedor = contatoFornecedor;
    }
}
