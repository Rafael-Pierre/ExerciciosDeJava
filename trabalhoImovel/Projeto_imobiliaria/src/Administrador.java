public class Administrador extends Pessoa {
    private Imobiliaria imobiliaria;

    public Administrador(String nome, String cpf, String telefone, Imobiliaria imobiliaria) {
        super(nome, cpf, telefone);
        this.imobiliaria = imobiliaria;
    }

    public Imobiliaria getImobiliaria() {
        return imobiliaria;
    }

    public void setImobiliaria(Imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }
}