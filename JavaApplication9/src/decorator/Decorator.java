package decorator;

import model.Bebida;

public abstract class Decorator extends Bebida {
    
    Bebida b;
    
    @Override
    public abstract String getNome();
    
}
