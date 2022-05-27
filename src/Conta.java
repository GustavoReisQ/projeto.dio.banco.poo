public abstract class Conta implements InConta{

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia, numero;
    protected double saldo;

    public Conta () {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
    }
    public void sacar(){

    }
    public void depositar(){

    }
    public void transferir(){

    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void ImprimirInfosComuns(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Agência: %.2f", this.saldo));
    }

}
