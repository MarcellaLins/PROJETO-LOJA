package src.pagamento;

public class PagamentoPix implements PagamentoStrategy {

    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Pagamento realizado com PIX. Valor: R$ " + valor;
    }
}
