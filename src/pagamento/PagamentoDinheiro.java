package src.pagamento;

public class PagamentoDinheiro implements PagamentoStrategy {

    private double valor;

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Pagamento realizado com cartão. Valor: R$ " + valor;
    }
}
