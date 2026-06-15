package src.imposto;

public class ImpostoSP implements ImpostoStrategy {

    @Override
    public double calcular(double valorProdutos) {
        return valorProdutos * 0.12;
    }
}