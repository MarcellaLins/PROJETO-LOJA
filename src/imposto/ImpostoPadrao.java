package src.imposto;

public class ImpostoPadrao implements ImpostoStrategy {

    @Override
    public double calcular(double valorProdutos) {
        return valorProdutos * 0.08;
    }
}