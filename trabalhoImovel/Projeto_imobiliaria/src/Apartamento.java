import java.time.LocalDate;

public class Apartamento extends Imovel {
    private double valorCondominio;

    public Apartamento(double valorVenda, String endereco, int anoConstrucao, double valorCondominio) {
        super(valorVenda, endereco, anoConstrucao);
        this.valorCondominio = valorCondominio;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularAluguel() {
        double aluguel = super.calcularAluguel();

        int idade = LocalDate.now().getYear() - getAnoConstrucao();

        if (idade >= 5 && idade % 5 == 0) {
            double desconto = Math.min(0.3, 0.05 * (idade / 5));
            aluguel = (1 - desconto) * aluguel;
        }

        aluguel += valorCondominio;

        return aluguel;
    }
}
