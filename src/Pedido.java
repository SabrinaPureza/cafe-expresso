import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void pagar() {
        if (status == StatusPedido.PENDENTE) {
            status = StatusPedido.PAGO;
        } else {
            System.out.println("Pagamento inválido neste estado.");
        }
    }

    public void enviarParaCozinha() {
        if (status == StatusPedido.PAGO) {
            status = StatusPedido.EM_PREPARO;
        } else {
            System.out.println("Pedido precisa estar PAGO para ir para preparo.");
        }
    }

    public void finalizarPedido() {
        if (status == StatusPedido.EM_PREPARO) {
            status = StatusPedido.FINALIZADO;
        } else {
            System.out.println("Pedido ainda não está pronto.");
        }
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
