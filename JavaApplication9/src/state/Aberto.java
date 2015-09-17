package state;

import model.Bebida;
import pedido.*;

public class Aberto extends Status {

    Pedido p;

    public Aberto(Pedido p) {
        this.p = p;
    }

    @Override
    public void addItem(Bebida b) {
        System.out.println("Adicionando ao seu pedido: "
                + b.getNome());
        p.getB().add(b);

    }

    @Override
    public void fecharPedido() {
        System.out.println("Fechando o pedido.");
        p.setStt(new Fechado(p));
        System.out.println("Preço final: R$"
                + p.valorFinal());
    }

    @Override
    public void abrirPedido() {
        System.out.println("O pedido já esta aberto.");
    }

}
