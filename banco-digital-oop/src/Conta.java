public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
       this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", this.agencia));
           System.out.println(String.format("Numero: %d", this.numero));
           System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
