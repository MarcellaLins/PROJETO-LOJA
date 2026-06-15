import src.desconto.CupomFreteGratis;
import src.desconto.Desconto;
import src.desconto.SemDesconto;
import src.model.Cliente;
import src.model.Estado;
import src.model.Frete;
import src.model.Pedido;
import src.model.TipoCliente;
import src.pagamento.PagamentoPix;
import src.pagamento_02.Pagamento;
import src.pagamento_02.PagamentoBase;
import src.pagamento_02.Pix;
import src.pagamento.PagamentoStrategy;
import src.pedido.ProcessadorPedido;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Ana Silva",
                "ana@email.com",
                "11999998888",
                Estado.SP,
                TipoCliente.VIP
        );

        Desconto desconto = new SemDesconto();
        desconto = new CupomFreteGratis(desconto);

        PagamentoStrategy pagamento = new PagamentoPix(
                500.0
        );

        Pedido pedido = new Pedido(
                cliente,
                pagamento,
                Frete.NORMAL,
                pagamento.getValor(),
                desconto,
                true
        );

        ProcessadorPedido processador = new ProcessadorPedido();

        double total = processador.calcularTotal(pedido);

        System.out.println("Total do pedido: R$ " + total);

    }
}