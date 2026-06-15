package src.frete;

import src.model.Pedido;
import src.model.Frete;

public class CalculadoraFrete {

    public double calcular(Pedido pedido) {

        FreteStrategy frete;

        switch (pedido.getFrete()) {
            case NORMAL:
                frete = new FreteNormal();
                break;

            case EXPRESSO:
                frete = new FreteExpresso();
                break;

            case RETIRADA:
                frete = new FreteRetirada();
                break;

            default:
                throw new IllegalArgumentException("Tipo de frete inválido");
        }

        return frete.calcularFrete(pedido);
    }
}