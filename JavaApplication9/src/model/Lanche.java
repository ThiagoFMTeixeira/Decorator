package model;

public abstract class Lanche implements Produto{
    
    private String descricao;
    
    public void cortarPao(){}
    public void adicionarCondimento(){}
    public void adicionarRecheioPrincipal(){}
    public void prensar(){}
    public void servir(){}
    public abstract double custo();

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public final void prepararLanche(){
        cortarPao();
        adicionarCondimento();
        adicionarRecheioPrincipal();
        prensar();
        servir();
    }
    
}
