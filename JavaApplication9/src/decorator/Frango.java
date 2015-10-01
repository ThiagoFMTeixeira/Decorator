package decorator;

import model.Lanche;

public class Frango extends Decorator_Lanche {

    public Frango(Lanche l) {
        this.l = l;
    }

    @Override
    public double custo() {
        return l.custo() + 1.25;
    }

    @Override
    public String getDescricao() {
        return l.getDescricao() + " com Frango.";
    }
    
}
