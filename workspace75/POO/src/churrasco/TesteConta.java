package churrasco;

public class TesteConta {

    public static void main(String[] args) {
        Conta conta = new Conta();

        // Configura o saldo inicial
        conta.setSaldo(10000);

        // Imprime o saldo inicial
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        // Realiza um saque de R$ 1000
        conta.sacar(1000);

        // Imprime o saldo após o saque
        System.out.println("Saldo após saque: R$" + conta.getSaldo());
    }
}
