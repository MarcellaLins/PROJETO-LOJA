package src.frete;

import src.model.Pedido;

public class FreteExpresso implements FreteStrategy{
	@Override
	public double calcularFrete(Pedido pedido) {
		double frete = 50;
		
		return frete;
	}
}