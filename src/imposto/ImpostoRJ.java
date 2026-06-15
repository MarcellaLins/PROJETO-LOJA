package src.imposto;

public class ImpostoRJ implements ImpostoStrategy {

    @Override
    public double calcular(double valorProdutos) {
        return valorProdutos * 0.15;
    }
}