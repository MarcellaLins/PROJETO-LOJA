package src.desconto;

import src.model.Pedido;

public class SemDesconto implements Desconto {

    @Override
    public double calcular(Pedido pedido) {
        return 0;
    }
}