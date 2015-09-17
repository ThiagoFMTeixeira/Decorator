package pagamentos;

public class Credito implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("Inserindo o cartão.");
        System.out.println("Digitando a senha.");
        System.out.println("Pagamento confirmado.");
    }
    
}
