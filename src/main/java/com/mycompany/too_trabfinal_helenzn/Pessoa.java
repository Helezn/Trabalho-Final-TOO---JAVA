package com.mycompany.too_trabfinal_helenzn;

public abstract class Pessoa {
    
    private String nome;
    private String telefone;
    private String email;
    
    public Pessoa(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    // getter
    public String getNome(){
        return this.nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    // setter
    public void setTelefone(String telefone){
       this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }    
    
     public String getInformacoes(){
        String aux="";
        if (nome != null)
            aux += "Nome: "+nome;
        if(telefone != null)
            aux+= "\nTelefone: "+telefone;
        if(email != null)
            aux += "\nAltura: "+email;
        return aux;
    }
     
    @Override
    public String toString() {
        return nome;
    }
}
