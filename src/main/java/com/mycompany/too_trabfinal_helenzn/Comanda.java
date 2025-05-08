package com.mycompany.too_trabfinal_helenzn;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Comanda {

    private int id;
    private Date data;

    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private boolean status;

     public Comanda(int id, Cliente cliente, Date data) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.status = false;
    }
     
    //getters
    public int getId() {
        return this.id;
    }

    private Date getData() {
        return data;
    }

    public boolean getStatus() {
        return this.status;
    }

    //setters 
    public void setId(int id) {
        this.id = id;
    }
    
    private void setData(Date data) {
        this.data = data;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //funções
    public void adicionarProduto(Produto produto) {
        if (!status) {
            produtos.add(produto);
        } else {
            System.out.println("A comanda já foi finalizada. Não é possível adicionar itens.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }

    public void finalizar() {
        this.status = true;
        System.out.println("Comanda finalizada. Total: R$" + calcularTotal());
    }

    public void exibirComanda() {
        SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = mascaraData.format(data);

        System.out.print("------------------------");
        System.out.println("\nComanda ID: " + id);
        System.out.println("Data: " + dataFormatada);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Itens consumidos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " (" + produto.getDescricao() + "): R$" + String.format("%.2f", produto.getValor()));
        }
        System.out.println("Total: R$" + calcularTotal());
        System.out.println(status ? "Status: Finalizada" : "Status: Aberta");
        System.out.println("------------------------");
    }
}
