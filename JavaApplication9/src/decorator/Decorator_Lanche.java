package decorator;

import model.Lanche;

public abstract class Decorator_Lanche extends Lanche {
    
    Lanche l;
    
    @Override
    public abstract String getDescricao();
}
