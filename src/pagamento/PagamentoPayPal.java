package src.pagamento;

public class PagamentoPayPal implements PagamentoStrategy {

    private double valor;
    private double valor_final = valor + (valor * 0.03);

    public PagamentoPayPal(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor_final;
    }

    @Override
    public String getDescricao() {
        return "Pagamento realizado com cartão PayPal. Valor: R$ " + valor_final;
    }
}
