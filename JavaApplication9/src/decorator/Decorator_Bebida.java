package decorator;

import model.Bebida;

public abstract class Decorator_Bebida extends Bebida {
    
    Bebida b;
    
    @Override
    public abstract String getNome();
    
}
