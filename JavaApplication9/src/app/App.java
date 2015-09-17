package app;

import decorator.Canela;
import decorator.Chantily;
import javax.swing.JOptionPane;
import model.Bebida;
import model.Cafe;
import model.Leite;
import pedido.Pedido;

public class App {

    public static void main(String[] args) {

        /*Bebida b;
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Bebidas: \n1 - Café\n2 - Leite"));

        if (x == 1) {
            b = new Cafe();
        } else {
            b = new Leite();
        }

        JOptionPane.showMessageDialog(null, "Bebida escolhida: " + b.getNome() + "\n Preço: " + b.custo());

        x = Integer.parseInt(JOptionPane.showInputDialog("Adicionais: \n1 - Chantily\n2 - Canela"));

        if (x == 1) {
            b = new Chantily(b);
        } else {
            b = new Canela(b);
        }

        JOptionPane.showMessageDialog(null, "Adicional escolhido: " + b.getNome() + "\n Preço final: " + b.custo());
               */
        
        Pedido p = new Pedido();
        
        p.addItem(new Cafe());
        p.addItem(new Chantily(new Cafe()));
        p.fecharPedido();
        p.addItem(new Cafe());
        p.addItem(new Chantily(new Cafe()));
        p.abrirPedido();
        p.addItem(new Cafe());
        p.addItem(new Chantily(new Cafe()));
        p.fecharPedido();
        
    }

}
