public class Main {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1500);
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
