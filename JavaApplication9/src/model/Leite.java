package model;

public class Leite extends Bebida{

    public Leite() {
        setNome("Leite ");
    }
    
    @Override
    public double custo() {
        return 1.0f;
    }
    
}
