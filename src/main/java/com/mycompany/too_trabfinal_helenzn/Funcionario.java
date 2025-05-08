package com.mycompany.too_trabfinal_helenzn;

public class Funcionario extends Pessoa {

    private String cargo;
    private String cpf;
    private String chave_pix;

    private int horas;
    private double valor_hora;

    public Funcionario(String nome, String telefone, String email, String cargo, String cpf, String chave_pix) {
        super(nome, telefone, email);
        this.cargo = cargo;
        this.cpf = cpf;
        this.chave_pix = chave_pix;
    }

    // getter
    public String getCargo() {
        return this.cargo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getCp() {
        return this.chave_pix;
    }

    public int getHoras() {
        return this.horas;
    }

    public double getVHora() {
        return this.valor_hora;
    }

    // setter
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCp(String chave_pix) {
        this.chave_pix = chave_pix;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public void setVHora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    
    @Override
    public String getInformacoes() {
        String aux = "Funcionario Cadastrado:\n";
        aux += super.getInformacoes();
        if (cargo != null) {
            aux += "\nCargo: " + cargo;
        }
        if (cpf != null) {
            aux += "\nCPF: " + cpf;
        }
        if (chave_pix != null) {
            aux += "\nChave Pix: " + chave_pix;
        }
        return aux;
    }

    public String gerarPagamento() {
        return "Pagamento de R$" + calcularHonorarios() + " realizado com sucesso";
    }

    public double calcularHonorarios() {
        return valor_hora * horas;
    }
}
