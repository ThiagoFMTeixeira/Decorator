package decorator;

import model.Bebida;

public class Canela extends Decorator_Bebida {

    public Canela(Bebida b) {
        this.b = b;
    }

    @Override
    public String getNome() {
        return b.getNome() + " com Canela";
    }

    @Override
    public double custo() {
        return b.custo() + 0.5f;
    }

}
