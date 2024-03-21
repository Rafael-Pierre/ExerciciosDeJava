import java.util.ArrayList;

public class Proprietario extends Pessoa {
    private ArrayList<Imovel> imoveis;

    public Proprietario(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.imoveis = new ArrayList<Imovel>();
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void addImovel(Imovel imovel) {
        imoveis.add(imovel);
    }
}