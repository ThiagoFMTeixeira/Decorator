package model;

public class XSalada extends Lanche {
    
    public XSalada() {
        setDescricao("X-Salada");
    }
    
    @Override
    public void cortarPao() {
        System.out.println("Cortando o pão pela metade..\n");
    }
    
    @Override
    public void adicionarCondimento() {
        System.out.println("Adicionando alface, tomate e cebola..\n");
    }
    
    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("Adicionando hamburger..\n");
    }
    
    @Override
    public void prensar() {
        System.out.println("Prensando o lanche..\n");
    }
    
    @Override
    public void servir() {
        System.out.println("Servindo o lanche..\n");
    }
    
    @Override
    public double custo() {
        return 4.75;
    }
    
}
