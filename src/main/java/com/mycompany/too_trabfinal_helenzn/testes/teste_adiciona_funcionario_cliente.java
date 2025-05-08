package com.mycompany.too_trabfinal_helenzn.testes;
import com.mycompany.too_trabfinal_helenzn.*;

public class teste_adiciona_funcionario_cliente {
    public static void main(String[] args) {
        // Criando objetos Funcionario
        Funcionario funcionario1 = new Funcionario (
                "João Silva",
                "(54)999999999",
                "joao.silva@email.com",
                "Motoboy",
                "123.456.789-00",
                "joaosilva@pix.com"
        );

        Funcionario funcionario2 = new Funcionario (
                "Maria Oliveira",
                "(54)988888888",
                "maria.oliveira@email.com",
                "Garçonete",
                "987.654.321-00",
                "mariaoliveira@pix.com"
        );

         Funcionario funcionario3 = new Funcionario (
                "Jefe Oliveira",
                "(54)988888888",
                "jefe.oliveira@email.com",
                "Cozinheiro",
                "237.654.321-00",
                "jefeoliveira@pix.com"
        );
         
        funcionario1.setHoras(144);
        funcionario1.setVHora(20.0);

        funcionario2.setHoras(150);
        funcionario2.setVHora(15.0);

        funcionario3.setHoras(160);
        funcionario3.setVHora(30.0);
        
        System.out.println(funcionario1.getInformacoes());
        System.out.println(funcionario1.gerarPagamento());

        System.out.println("\n" + funcionario2.getInformacoes());
        System.out.println(funcionario2.gerarPagamento());
        
        System.out.println("\n" + funcionario3.getInformacoes());
        System.out.println(funcionario3.gerarPagamento());
        
 
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

        System.out.println(cliente1.getInformacoes());
        System.out.println("\n" + cliente2.getInformacoes());
    
    }
}
