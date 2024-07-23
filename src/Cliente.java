public class Cliente {


    public String nome;
    public Banco banco;

    public Cliente(String nome, Banco banco){
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    public Cliente(String nome) {
    this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }
}
