public class Main {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);

        cc.transferir(100, poupanca);

       cc.imprimirExrato();
       poupanca.imprimirExrato();

    }
}
