package decorator;

import model.Lanche;

public class Picles extends Decorator_Lanche{

    public Picles(Lanche l) {
        this.l = l;
    }
    
    @Override
    public String getDescricao() {
        return l.getDescricao() + " com Picles.";
    }

    @Override
    public double custo() {
        return l.custo() + 0.75;
    }
    
}
