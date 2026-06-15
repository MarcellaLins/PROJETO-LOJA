package src.desconto;

import src.model.Pedido;

public class DescontoFuncionario
		extends DescontoDecorator {

	public DescontoFuncionario(Desconto desconto) {
		super(desconto);
	}

	@Override
	public double calcular(Pedido pedido) {

		return super.calcular(pedido)
				+ pedido.getValorProdutos() * 0.30;
	}
}