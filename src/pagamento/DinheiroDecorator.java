package src.pagamento;

public class DinheiroDecorator extends PagamentoDecorator {

    private double valor;

    public DinheiroDecorator(Pagamento pagamento, double valor) {
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
                "Dinheiro: R$ " + valor + "\n";
    }
}