package src.notificacao;

import src.model.Pedido;

public class NotificacaoEmail implements NotificacaoObserver {

    @Override
    public void notificar(Pedido pedido) {

        System.out.println(
            "Enviando email para " + pedido.getCliente().getEmail()
        );
    }
}