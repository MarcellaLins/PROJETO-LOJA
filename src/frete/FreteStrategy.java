package src.frete;
import src.model.Pedido;

public interface FreteStrategy {
    double calcularFrete(Pedido pedido);
}