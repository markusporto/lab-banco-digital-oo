public class Main {
    public static void main(String[] args) {
        Banco bank = new Banco();

        bank.setNome("Porto Bank");

        Cliente markus = new Cliente("Markus", bank);
        markus.setNome("Markus Porto");

        Conta cc = new ContaCorrente(markus);

        cc.depositar(100);

        Cliente vinicius = new Cliente("Vinicius", bank);
        Conta poupanca = new ContaPoupanca(vinicius);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.trasferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        bank.listarClientes();

        Cliente adilson = new Cliente("Adilson", bank);
        Conta cc2 = new ContaCorrente(adilson);
        cc2.imprimirExtrato();
        bank.listarClientes();

    }
}
