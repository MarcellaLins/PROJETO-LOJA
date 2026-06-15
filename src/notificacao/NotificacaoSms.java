package src.notificacao;

import src.model.Pedido;

public class NotificacaoSms implements NotificacaoObserver {

    @Override
    public void notificar(Pedido pedido) {

        String telefone =
                pedido.getCliente().getTelefone();

        if (telefone != null && !telefone.isBlank()) {

            System.out.println(
                "Enviando SMS para " + telefone
            );
        }
    }
}