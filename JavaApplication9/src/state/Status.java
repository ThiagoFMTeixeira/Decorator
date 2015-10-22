package state;

import model.Bebida;
import model.Produto;
import pagamentos.Pagamento;

public abstract class Status {

    public abstract void addItem(Produto item);

    public abstract void fecharPedido();

    public abstract void abrirPedido();
    
    public abstract void pagar(Pagamento pgto);

}
