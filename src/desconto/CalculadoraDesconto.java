package src.desconto;

import src.desconto.Desconto;
import src.model.Pedido;

public class CalculadoraDesconto {

    public double calcular(
            Pedido pedido,
            Desconto desconto) {

        double valorDesconto =
                desconto.calcular(pedido);

        double limite =
                pedido.getValorProdutos() * 0.40;

        return Math.min(
                valorDesconto,
                limite
        );
    }
}