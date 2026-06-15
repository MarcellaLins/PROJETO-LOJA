package src.imposto;

public class ImpostoMG implements ImpostoStrategy {

    @Override
    public double calcular(double valorProdutos) {
        return valorProdutos * 0.10;
    }
}