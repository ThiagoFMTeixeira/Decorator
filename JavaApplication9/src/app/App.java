package app;

import decorator.Frango;
import decorator.Picles;
import javax.swing.SpringLayout;
import model.Lanche;
import model.XBacon;
import model.XSalada;

public class App {

    public static void main(String[] args) {
        
        
        Lanche lan1, lan2;
        
        lan1 = new XSalada();
        
        lan2 = new XBacon();
        
        System.out.println("\nPreparando o X-Salada...\n");
        lan1.prepararLanche();
        System.out.println("Custo: " + lan1.custo());
        System.out.println("\nAdicionando Frango...\n");
        lan1 = new Frango(lan1);
        System.out.println("Lanche Final: " + lan1.getDescricao() + "\nCusto: " + lan1.custo());
        
        System.out.println("\nPreparando o X-Bacon...\n");
        lan2.prepararLanche();
        System.out.println("Custo: " + lan1.custo());
        System.out.println("\nAdicionando Picles...\n");
        lan2 = new Picles(lan2);
        System.out.println("Lanche Final: " + lan2.getDescricao() + "\nCusto: " + lan2.custo());
        
        
    }

}
