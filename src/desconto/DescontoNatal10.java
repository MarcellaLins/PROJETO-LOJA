package src.desconto;

import src.model.Pedido;

public class DescontoNatal10
		extends DescontoDecorator {

	public DescontoNatal10(Desconto desconto) {
		super(desconto);
	}

	@Override
	public double calcular(Pedido pedido) {

		return super.calcular(pedido)
				+ pedido.getValorProdutos() * 0.10;
	}
}