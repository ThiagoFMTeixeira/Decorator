package model;

public abstract class Bebida implements Produto {

    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double custo();

    @Override
    public String getDescricao() {
        return this.getNome();
    }

}
