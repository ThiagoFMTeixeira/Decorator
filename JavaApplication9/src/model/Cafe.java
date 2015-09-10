package model;

public class Cafe extends Bebida{
    
    public Cafe() {
        setNome("Cafe");
    }

    @Override
    public double custo() {
        return 0.75f;
    }
    
}
