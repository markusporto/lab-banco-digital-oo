public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @java.lang.Override
    public void imprimirExtrato() {
        System.out.println("------Extrato Poupanca------");
        super.imprimirInformacoesComuns();
    }


}
