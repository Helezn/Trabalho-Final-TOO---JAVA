package com.mycompany.too_trabfinal_helenzn.testes;
import com.mycompany.too_trabfinal_helenzn.*;

public class teste_insere_mostra_cardapio {
    public static void main(String[] args) {
        
        Cardapio cardapio = new Cardapio();

        cardapio.adicionarProduto(new Produto("X-Sabor & Aconchego", "Pão de hambúrguer macio, hambúrguer de carne 100% bovina, queijo cheddar cremoso, alface fresca, tomate e maionese especial da casa.", 18.90, TipoProduto.LANCHE));
        cardapio.adicionarProduto(new Produto("X-Tudo da Casa", "Pão de hambúrguer, hambúrguer de carne, frango desfiado, bacon crocante, queijo prato, queijo cheddar, alface, tomate e molho barbecue.", 24.90,  TipoProduto.LANCHE));
        cardapio.adicionarProduto(new Produto("Cachorrão Apimentado", "Pão de hot dog, salsicha artesanal, cebola caramelizada, molho picante, cheddar derretido e picles.", 15.90, TipoProduto.LANCHE));
        cardapio.adicionarProduto(new Produto("Hambúrguer Veggie Delight", "Pão integral, hambúrguer de grão de bico, queijo vegano, alface, tomate, cebola roxa e molho pesto de manjericão.", 22.90,  TipoProduto.LANCHE));
        cardapio.adicionarProduto(new Produto("Frango Crocante & Maionese Especial", "Pão de hambúrguer, filé de frango empanado, queijo mussarela, alface, tomate e maionese especial da casa.", 19.90,  TipoProduto.LANCHE));
        cardapio.adicionarProduto(new Produto("Batata Rústica com Bacon", "Porção de batatas rústicas crocantes, cobertas com bacon frito e queijo cheddar derretido.", 16.90,  TipoProduto.LANCHE));
        cardapio.adicionarProduto(new Produto("Suco Natural de Laranja","Suco 100% natural de laranja, refrescante e saudável.", 8.90, TipoProduto.BEBIDA));
        cardapio.adicionarProduto(new Produto("Milkshake de Morango", "Milkshake cremoso de morango com sorvete e leite condensado.", 12.90, TipoProduto.BEBIDA));
        cardapio.adicionarProduto(new Produto("Refrigerante Cola",  "Refrigerante de cola gelado, refrescante e clássico.", 6.50, TipoProduto.BEBIDA));
        cardapio.adicionarProduto(new Produto("Café Expresso", "Café expresso forte, perfeito para começar o dia.", 5.00, TipoProduto.BEBIDA));
        cardapio.adicionarProduto(new Produto("Suco Detox de Couve", "Suco detox de couve, maçã e limão, refrescante e saudável.", 11.90, TipoProduto.BEBIDA));
        cardapio.adicionarProduto(new Produto("Água de Coco", "Água de coco fresca, direto da fruta, ideal para hidratação.", 5.90, TipoProduto.BEBIDA));
        
        
        System.out.println("Cardapio Lanches: ");        
        cardapio.exibirCardapioLanche();

        
        System.out.println("Cardapio Bebidas: ");  
        cardapio.exibirCardapioBebida();
        
        System.out.println("Cardapio Completo: ");  
        cardapio.exibirCardapio();
               
    }
}
