public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @java.lang.Override
    public void imprimirExtrato() {
        System.out.println("------Extrato CC------");
        super.imprimirInformacoesComuns();
    }
}
