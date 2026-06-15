package src.desconto;

import src.model.Pedido;

public class DescontoBlackFriday
        extends DescontoDecorator {

    public DescontoBlackFriday(Desconto desconto) {
        super(desconto);
    }

    @Override
    public double calcular(Pedido pedido) {

        return super.calcular(pedido)
                + pedido.getValorProdutos() * 0.25;
    }
}