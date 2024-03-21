public class Casa extends TipoImovel {

    public Casa(double aliquota, double descontoMaximo, double acrescimoBeneficios) {
        super(aliquota, descontoMaximo, acrescimoBeneficios);
    }

    @Override
    public double calcularAluguel(double valorVenda, int anoConstrucao) {
        double aluguel = valorVenda * getAliquota();
        int idadeImovel = 2023 - anoConstrucao;
        double desconto = idadeImovel / 5 * 0.1;
        if (desconto > getDescontoMaximo()) {
            desconto = getDescontoMaximo();
        }
        aluguel -= aluguel * desconto;
        aluguel += aluguel * getAcrescimoBeneficios();
        return aluguel;
    }

}