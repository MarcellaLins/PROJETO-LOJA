package src.desconto;

import src.model.Pedido;

public class DescontoVip
        extends DescontoDecorator {

    public DescontoVip(Desconto desconto) {
        super(desconto);
    }

    @Override
    public double calcular(Pedido pedido) {

        return super.calcular(pedido)
                + pedido.getValorProdutos() * 0.15;
    }
}