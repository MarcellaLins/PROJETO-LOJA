package src.pagamento;

public class PixDecorator extends PagamentoDecorator {

    private double valor;

    public PixDecorator(Pagamento pagamento, double valor) {
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
                "Pix: R$ " + valor + "\n";
    }
}