package src.desconto;

import src.model.Pedido;

public abstract class DescontoDecorator
        implements Desconto {

    protected Desconto desconto;

    public DescontoDecorator(Desconto desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcular(Pedido pedido) {
        return desconto.calcular(pedido);
    }
}