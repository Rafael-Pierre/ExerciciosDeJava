import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private Imovel imovel;
    private Proprietario proprietario;
    private double valor;
    private List<Servico> servicos;

    public Aluguel(Imovel imovel, Proprietario proprietario) {
        this.imovel = imovel;
        this.proprietario = proprietario;
        this.servicos = new ArrayList<>();
        this.valor = calcularValor();
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public double getValor() {
        return valor;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
        valor += servico.getValor();
    }

    private double calcularValor() {
        double valorAluguel = imovel.calcularAluguel();
        double comissao = 0.12 * valorAluguel;
        return valorAluguel + comissao;
    }

    public double getValorLiquido() {
        return valor - 0.12 * valor;
    }
}