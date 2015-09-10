package decorator;

import model.Bebida;

public class Chantily extends Decorator{

    public Chantily(Bebida b) {
        this.b = b;    
    }

    @Override
    public String getNome() {
        return b.getNome() + "com Chantily";
    }

    @Override
    public double custo() {
        return b.custo() +  1.5f;
    }
    
    
    
    
    
}
