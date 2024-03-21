public abstract class TipoImovel {
    private double aliquota;
    private double descontoMaximo;
    private double acrescimoBeneficios;

    public TipoImovel(double aliquota, double descontoMaximo, double acrescimoBeneficios) {
        this.aliquota = aliquota;
        this.descontoMaximo = descontoMaximo;
        this.acrescimoBeneficios = acrescimoBeneficios;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public double getAcrescimoBeneficios() {
        return acrescimoBeneficios;
    }

    public void setAcrescimoBeneficios(double acrescimoBeneficios) {
        this.acrescimoBeneficios = acrescimoBeneficios;
    }

    public abstract double calcularAluguel(double valorVenda, int anoConstrucao);

}