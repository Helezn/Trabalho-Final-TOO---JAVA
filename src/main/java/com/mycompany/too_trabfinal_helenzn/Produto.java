package com.mycompany.too_trabfinal_helenzn;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    
    private String nome;
    private String descricao;
    private double valor;
    private TipoProduto tipo;

    public Produto(String nome, String descricao, double valor, TipoProduto tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo= tipo;
    }

    //getters
    public String getNome() {
        return nome;
    }
        
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
    
    public TipoProduto getTipo() {
        return tipo;
    }
    
    //setters
    public void setNome(String nome){
       this.nome = nome;
    }
    
    public void setDescricao(String descricao){
       this.descricao = descricao;
    }
    
    public void setValor(double valor){
       this.valor = valor;
    }
    
     public void setTipo(TipoProduto tipo){
       this.tipo = tipo;
    }
     
    //funcoes utilizadas nos testes
    public void exibirProdutos() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("-----------------------------");
    }
    
}
