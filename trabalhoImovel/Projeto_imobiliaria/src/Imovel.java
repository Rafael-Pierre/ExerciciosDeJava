public class Imovel {
    private double valorVenda;
    private String endereco;
    private int anoConstrucao;
    private double valorInicial, descontoPercentual, acrescimoPercentual, taxaImobiliariaPercentual;

    public Imovel(double valorVenda, String endereco, int anoConstrucao, double valorInicial, double descontoPercentual, double acrescimoPercentual, double taxaImobiliariaPercentual) {
        this.valorVenda = valorVenda;
        this.endereco = endereco;
        this.anoConstrucao = anoConstrucao;
        this.valorInicial =  valorInicial;
        this.descontoPercentual = descontoPercentual;
        this.acrescimoPercentual = acrescimoPercentual;
        this.taxaImobiliariaPercentual = taxaImobiliariaPercentual;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public double calcularAluguel() {
        double valorComDesconto = valorInicial - (valorInicial * (descontoPercentual / 100.0));
        double valorComAcrescimo = valorComDesconto + (valorComDesconto * (acrescimoPercentual / 100.0));
        double valorRecebidoImobiliaria = valorComAcrescimo * (taxaImobiliariaPercentual / 100.0);
        double valorTotalArrecadado = valorComAcrescimo + valorRecebidoImobiliaria;

        return valorTotalArrecadado;
    }

}