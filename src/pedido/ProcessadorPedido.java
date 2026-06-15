package src.pedido;

import src.desconto.CalculadoraDesconto;
import src.frete.CalculadoraFrete;
import src.imposto.CalculadoraImposto;
import src.model.Pedido;

public class ProcessadorPedido {

    private final CalculadoraDesconto calculadoraDesconto =
            new CalculadoraDesconto();

    private final CalculadoraImposto calculadoraImposto =
            new CalculadoraImposto();

    private final CalculadoraFrete calculadoraFrete =
            new CalculadoraFrete();

    public double calcularTotal(Pedido pedido) {

        double valorDesconto =
                calculadoraDesconto.calcular(
                        pedido,
                        pedido.getDesconto());

        double valorImposto =
                calculadoraImposto.calcular(
                        pedido);

        double valorFrete =
                calculadoraFrete.calcular(
                        pedido);

        double valorEmbrulho =
                pedido.isEmbrulhoPresente() ? 5.0 : 0.0;

        return pedido.getValorProdutos()
                - valorDesconto
                + valorImposto
                + valorFrete
                + valorEmbrulho;
    }
}