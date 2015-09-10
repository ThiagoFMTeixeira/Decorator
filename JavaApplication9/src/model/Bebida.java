package model;

public abstract class Bebida  {
    
    String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract double custo();
    
}
