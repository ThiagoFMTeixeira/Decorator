package pedido;

import model.Bebida;

public abstract class Status {

    public abstract void addItem(Bebida b);

    public abstract void fecharPedido();

    public abstract void abrirPedido();

}
