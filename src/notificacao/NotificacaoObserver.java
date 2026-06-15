package src.notificacao;

import src.model.Pedido;

public interface NotificacaoObserver {
    public void notificar(Pedido pedido);
}
