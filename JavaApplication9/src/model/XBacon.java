package model;

public class XBacon extends Lanche {

    public XBacon() {
        setDescricao("X-Bacon");
    }

    @Override
    public void cortarPao() {
        System.out.println("Cortando o pão na diagonal..\n");
    }

    @Override
    public void adicionarCondimento() {
        System.out.println("Adicionando o bacon..\n");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("Adicionando o hamburger..\n");
    }

    @Override
    public void prensar() {
        System.out.println("Presando o lanche..\n");
    }

    @Override
    public void servir() {
        System.out.println("Servindo o lanche..\n");
    }

    @Override
    public double custo() {
        return 6.0f;
    }

}
