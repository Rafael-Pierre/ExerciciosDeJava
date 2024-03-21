import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis;
    private List<Aluguel> alugueis;

    public Imobiliaria() {
        imoveis = new ArrayList<>();
        alugueis = new ArrayList<>();
    }

    public void cadastrarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void removerImovel(Imovel imovel) {
        imoveis.remove(imovel);
    }

    public List<Imovel> getImoveisPorAno(int ano) {
        List<Imovel> imoveisPorAno = new ArrayList<>();
        for (Imovel imovel : imoveis) {
            if (imovel.getAnoConstrucao() == ano) {
                imoveisPorAno.add(imovel);
            }
        }
        return imoveisPorAno;
    }

    public double getGanhoTotal() {
        double total = 0;
        for (Aluguel aluguel : alugueis) {
            total += aluguel.getValor();
        }
        return total;
    }

    public double getGanhoProprietario(Proprietario proprietario) {
        double total = 0;
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getProprietario().equals(proprietario)) {
                total += aluguel.getValorLiquido();
            }
        }
        return total;
    }

    public void realizarAluguel(Imovel imovel, Proprietario proprietario) {
        Aluguel aluguel = new Aluguel(imovel, proprietario);
        alugueis.add(aluguel);
    }
}