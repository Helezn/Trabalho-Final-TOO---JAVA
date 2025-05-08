/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.too_trabfinal_helenzn;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class Cardapio {
    private List<Produto> produtos;
   
    public Cardapio() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirCardapioLanche() {
        System.out.println("------ Cardápio Lancheria LANCHES ------");
        for (Produto produto: produtos) {
            if(produto.getTipo()== TipoProduto.LANCHE)
            produto.exibirProdutos();
        }
    }
    
    public void exibirCardapioBebida() {
        System.out.println("------ Cardápio Lancheria BEBIDAS ------");
        for (Produto produto: produtos) {
            if(produto.getTipo()== TipoProduto.BEBIDA)
            produto.exibirProdutos();
        }
    }
    
    public void exibirCardapio() {
        System.out.println("------ Cardápio Lancheria ------");
        for (Produto produto: produtos) {
            produto.exibirProdutos();
        }
    }
}
