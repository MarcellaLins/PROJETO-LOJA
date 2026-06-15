package src.pagamento;

public class PagamentoCartao implements PagamentoStrategy {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Pagamento realizado com cartão. Valor: R$ " + valor;
    }

}
