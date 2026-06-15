package src.model;

import src.desconto.Desconto;
import src.pagamento.PagamentoStrategy;

public class Pedido {

    private Cliente cliente;
    private PagamentoStrategy pagamento;
    private Frete frete;
    private double valorProdutos;
    private Desconto desconto;
    private boolean embrulhoPresente;

    public Pedido(Cliente cliente,
                  PagamentoStrategy pagamento,
                  Frete frete,
                  double valorProdutos,
                  Desconto desconto,
                  boolean embrulhoPresente) {

        this.cliente = cliente;
        this.pagamento = pagamento;
        this.frete = frete;
        this.valorProdutos = valorProdutos;
        this.desconto = desconto;
        this.embrulhoPresente = embrulhoPresente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PagamentoStrategy getPagamento() {
        return pagamento;
    }

    public Frete getFrete() {
        return frete;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public boolean isEmbrulhoPresente() {
        return embrulhoPresente;
    }
}