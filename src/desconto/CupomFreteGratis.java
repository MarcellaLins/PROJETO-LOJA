package src.desconto;

import src.frete.CalculadoraFrete;
import src.model.Frete;
import src.model.Pedido;

public class CupomFreteGratis extends DescontoDecorator {

    private final CalculadoraFrete calculadoraFrete =
            new CalculadoraFrete();

    public CupomFreteGratis(Desconto desconto) {
        super(desconto);
    }

    @Override
    public double calcular(Pedido pedido) {

        double descontoAtual = super.calcular(pedido);

        // Não vale para frete expresso
        if (pedido.getFrete() == Frete.EXPRESSO) {
            return descontoAtual;
        }

        return descontoAtual +
                calculadoraFrete.calcular(pedido);
    }
}