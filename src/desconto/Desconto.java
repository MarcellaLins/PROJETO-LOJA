package src.desconto;

import src.model.Pedido;

public interface Desconto {

    double calcular(Pedido pedido);

}