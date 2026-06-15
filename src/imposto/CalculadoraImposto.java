package src.imposto;

import src.model.Pedido;

public class CalculadoraImposto {

    public double calcular(Pedido pedido) {

        ImpostoStrategy imposto;

        switch (pedido.getCliente().getEstado()) {

            case SP:
                imposto = new ImpostoSP();
                break;

            case RJ:
                imposto = new ImpostoRJ();
                break;

            case MG:
                imposto = new ImpostoMG();
                break;

            default:
                imposto = new ImpostoPadrao();
        }

        return imposto.calcular(
                pedido.getValorProdutos()
        );
    }
}