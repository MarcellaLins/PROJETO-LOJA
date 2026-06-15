package src.notificacao;

import src.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class CentralNotificacoes {

    private final List<NotificacaoObserver> observers =
            new ArrayList<>();

    public void adicionarObserver(
            NotificacaoObserver observer) {

        observers.add(observer);
    }

    public void removerObserver(
            NotificacaoObserver observer) {

        observers.remove(observer);
    }

    public void notificarTodos(
            Pedido pedido) {

        for (NotificacaoObserver observer : observers) {

            observer.notificar(pedido);
        }
    }
}