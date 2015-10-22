package model;

import java.util.ArrayList;
import pagamentos.Pagamento;
import state.Status;
import state.Aberto;

public class Pedido {

    private ArrayList<Bebida> beb;
    private ArrayList<Lanche> lan;
    private Status stt;

    public Pedido() {
        
        lan = new ArrayList<>();
        beb = new ArrayList();
        stt = new Aberto(this);
    }

    public ArrayList<Lanche> getLan() {
        return lan;
    }

    public void setLan(ArrayList<Lanche> lan) {
        this.lan = lan;
    }
    
    public ArrayList<Bebida> getB() {
        return beb;
    }

    public void setB(ArrayList<Bebida> b) {
        this.beb = b;
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

    public void addItem(Produto item) {
        stt.addItem(item);
    }

    public double valorFinal() {
        double soma = 0;

        for (Bebida b1 : beb) {
            soma += b1.custo();
        }
        
        for (Lanche l1 : lan) {
            soma += l1.custo();
        }

        return soma;
    }
    
    public void pagar(Pagamento pgto){
        stt.pagar(pgto);
    }

}
