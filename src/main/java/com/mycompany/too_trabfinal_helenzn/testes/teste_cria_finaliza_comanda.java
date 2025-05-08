package com.mycompany.too_trabfinal_helenzn.testes;
import com.mycompany.too_trabfinal_helenzn.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class teste_cria_finaliza_comanda {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(
                "Carlos Souza",
                "1133333333",
                "carlos.souza@email.com",
                "Rua das Flores, 123"
        );

        Cliente cliente2 = new Cliente(
            "Ana Pereira",
                "2194444444",
                "ana.pereira@email.com",
                "Av. Paulista, 456"
        );
        
        Produto produto1 = new Produto("Café", "Café expresso pequeno", 5.0, TipoProduto.BEBIDA);
        Produto produto2 = new Produto("Pão de Queijo", "Pão de queijo médio", 7.0, TipoProduto.LANCHE);
        Produto produto3 =(new Produto("Frango Crocante & Maionese Especial", "Pão de hambúrguer, filé de frango empanado, queijo mussarela, alface, tomate e maionese especial da casa.", 19.90,  TipoProduto.LANCHE));
        Produto produto4 =(new Produto("Batata Rústica com Bacon", "Porção de batatas rústicas crocantes, cobertas com bacon frito e queijo cheddar derretido.", 16.90,  TipoProduto.LANCHE));
        
        Date dt = null;
        SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dt = mascaraData.parse("09/12/2024");
        } catch (ParseException ex) {
            return; 
        }

        Comanda comanda1 = new Comanda(1, cliente1, dt);

        comanda1.adicionarProduto(produto1);
        comanda1.adicionarProduto(produto2);

        comanda1.exibirComanda();

        comanda1.finalizar();
        
        comanda1.adicionarProduto(produto3);
        
        try {
            dt = mascaraData.parse("07/12/2024");
        } catch (ParseException ex) {
            return; 
        }
  
        Comanda comanda2 = new Comanda(2, cliente2,dt);

        comanda2.adicionarProduto(produto3);
        comanda2.adicionarProduto(produto4);

        comanda2.exibirComanda();

        comanda2.finalizar();
    }
}
