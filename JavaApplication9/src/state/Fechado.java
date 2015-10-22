package state;

import model.Bebida;
import pagamentos.Pagamento;
import model.Pedido;
import model.Produto;

public class Fechado extends Status {
    
    Pedido p;
    Pagamento pgto;

    public Fechado(Pedido p) {
        this.p = p;
    }
    
    @Override
    public void addItem(Produto item) {
        System.out.println("Seu pedido esta fechado, não é possível adicionar mais nada");
    }

    @Override
    public void fecharPedido() {
        System.out.println("Seu pedido já esta fechado.");
    }

    @Override
    public void abrirPedido() {
        System.out.println("vamos reabrir o seu pedido");
        p.setStt(new Aberto(p));
    }

    @Override
    public void pagar(Pagamento pgto) {
        pgto.pagar();
    }
    
}
