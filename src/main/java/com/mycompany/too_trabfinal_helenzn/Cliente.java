package com.mycompany.too_trabfinal_helenzn;

public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(String nome, String telefone, String email, String endereco) {
        super(nome, telefone, email);
        this.endereco = endereco;
    }

    // getter
    public String getEndereco() {
        return this.endereco;
    }

    // setter
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getInformacoes() {
        String aux = "Cliente Cadastrado:\n";
        aux += super.getInformacoes();
        if (endereco != null) {
            aux += "\nEndereço: " + endereco;
        }
        return aux;
    }
}
