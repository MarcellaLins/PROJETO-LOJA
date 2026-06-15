import java.util.Scanner;

import src.desconto.*;
import src.model.*;
import src.pagamento.*;
import src.pedido.ProcessadorPedido;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CLIENTE =====
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Estado (SP/RJ/MG): ");
        Estado estado = Estado.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Tipo Cliente (COMUM/VIP/FUNCIONARIO): ");
        TipoCliente tipoCliente = TipoCliente.valueOf(sc.nextLine().toUpperCase());

        Cliente cliente = new Cliente(nome, email, telefone, estado, tipoCliente);

        // ===== VALOR PRODUTOS =====
        System.out.print("Valor dos produtos: ");
        double valorProdutos = sc.nextDouble();
        sc.nextLine();

        // ===== FRETE =====
        System.out.print("Frete (NORMAL/EXPRESSO/RETIRADA): ");
        Frete frete = Frete.valueOf(sc.nextLine().toUpperCase());

        // ===== EMBRULHO =====
        System.out.print("Embrulho presente? (s/n): ");
        boolean embrulho = sc.nextLine().equalsIgnoreCase("s");

        // ===== DESCONTOS =====
        Desconto desconto = new SemDesconto();

        if (tipoCliente == TipoCliente.VIP) {
            desconto = new DescontoVip(desconto);
        }

        System.out.print("Aplicar cupom frete grátis? (s/n): ");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            desconto = new CupomFreteGratis(desconto);
        }

        // ===== PAGAMENTO =====
        System.out.print("Pagamento (PIX/PAYPAL/DINHEIRO/CARTAO): ");
        String tipoPagamento = sc.nextLine().toUpperCase();

        Pagamento pagamento = new PagamentoBase();

        if (tipoPagamento.equals("PIX")) {
            System.out.print("Valor PIX: ");
            double valorPix = sc.nextDouble();
            pagamento = new Pix(pagamento, valorPix);
        }

        if (tipoPagamento.equals("PAYPAL")) {
            pagamento = new PayPal(pagamento);
        }

        // ===== PEDIDO =====
        Pedido pedido = new Pedido(
                cliente,
                pagamento,
                frete,
                valorProdutos,
                desconto,
                embrulho
        );

        // ===== PROCESSAMENTO =====
        ProcessadorPedido processador = new ProcessadorPedido();

        double total = processador.calcularTotal(pedido);

        System.out.println("\n===== RESUMO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Total: R$ " + total);

        System.out.println("\nDetalhes pagamento:");
        System.out.println(pagamento.getDescricao());

        sc.close();
    }
}