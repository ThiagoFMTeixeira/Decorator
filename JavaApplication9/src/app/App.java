package app;

import decorator.Frango;
import decorator.Picles;
import model.Bebida;
import model.Cafe;
import model.Lanche;
import model.Leite;
import model.Pedido;
import model.XBacon;
import model.XSalada;

public class App {

    public static void main(String[] args) {
        
        
        Lanche lan1, lan2;
        lan1 = new XSalada();
        lan2 = new XBacon();
        
        Bebida beb1, beb2;
        beb1 = new Cafe();     
        beb2 = new Leite();
        
        Pedido p = new Pedido();
        
        p.addItem(lan2);
        p.addItem(lan1);
        p.addItem(beb2);
        p.addItem(beb1);
        
        
        System.out.println("Custo final do seu pedido: " + p.valorFinal());
        
    }

}
