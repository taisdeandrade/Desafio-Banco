import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
