public class Main {

    public static void main(String[] args) {
        Cliente Pedro = new Cliente();
        Pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(Pedro);
        Conta cp = new ContaPoupanca(Pedro);


        cc.depositar(200);
        cc.imprimirExtrato();
        cc.transferir(200, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
