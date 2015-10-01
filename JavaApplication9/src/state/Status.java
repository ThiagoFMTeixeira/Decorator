package state;

import model.Bebida;
import pagamentos.Pagamento;

public abstract class Status {

    public abstract void addItem(Bebida b);

    public abstract void fecharPedido();

    public abstract void abrirPedido();
    
    public abstract void pagar(Pagamento pgto);

}
