package src.pagamento;

public class PagamentoBase implements Pagamento {

    @Override
    public double getValor() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return "";
    }

}