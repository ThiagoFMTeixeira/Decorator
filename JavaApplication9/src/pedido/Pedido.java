package pedido;

import java.util.ArrayList;
import model.Bebida;
import pagamentos.Pagamento;
import state.Aberto;

public class Pedido {

    private ArrayList<Bebida> b;
    private Status stt;

    public Pedido() {

        b = new ArrayList();
        stt = new Aberto(this);
    }

    public ArrayList<Bebida> getB() {
        return b;
    }

    public void setB(ArrayList<Bebida> b) {
        this.b = b;
    }

    public Status getStt() {
        return stt;
    }

    public void setStt(Status stt) {
        this.stt = stt;
    }

    public void fecharPedido() {
        stt.fecharPedido();
    }

    public void abrirPedido() {
        stt.abrirPedido();
    }

    public void addItem(Bebida b) {
        stt.addItem(b);
    }

    public double valorFinal() {
        double soma = 0;

        for (Bebida b1 : b) {
            soma += b1.custo();
        }

        return soma;
    }
    
    public void pagar(Pagamento pgto){
        stt.pagar(pgto);
    }

}
