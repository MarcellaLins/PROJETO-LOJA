package src.frete;

import src.model.Pedido;

public class FreteNormal implements FreteStrategy{
	@Override
	public double calcularFrete(Pedido pedido) {
		double frete = 20;
		
		return frete;
	}
}