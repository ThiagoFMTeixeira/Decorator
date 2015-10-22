package state;

import model.Pedido;
import model.Bebida;
import model.Lanche;
import model.Produto;
import pagamentos.Pagamento;

public class Aberto extends Status {

    Pedido p;

    public Aberto(Pedido p) {
        this.p = p;
    }

    @Override
    public void addItem(Produto item) {
        
        if (item instanceof Bebida) {
            System.out.println("Adicionando ao seu pedido: " + item.getDescricao() );
            p.getB().add((Bebida) item);
        }
        if (item instanceof Lanche) {
            System.out.println("Adicionando ao seu pedido: " + item.getDescricao() );
            p.getLan().add((Lanche) item);
        }

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

    @Override
    public void pagar(Pagamento pgto) {
        System.out.println("Seu pedido esta aberto!"
                + "Não é possível fazer o pagamento.");
    }

}
