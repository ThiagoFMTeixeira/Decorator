package pagamentos;

public class Dinheiro implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Recebendo o dinheiro.");
        System.out.println("Contando as cédulas.");
        System.out.println("Confirmando o pagamento.");
    }
    
}
