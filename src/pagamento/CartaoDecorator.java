package src.pagamento;

public class CartaoDecorator extends PagamentoDecorator {

    private double valor;

    public CartaoDecorator(Pagamento pagamento, double valor) {
        super(pagamento);
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return pagamento.getValor() + valor;
    }

    @Override
    public String getDescricao() {
        return pagamento.getDescricao() +
                "Cartão: R$ " + valor + "\n";
    }
}