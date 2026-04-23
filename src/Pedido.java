import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status = StatusPedido.PENDENTE;

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("\n--- Seu Pedido ---");
        for (ItemPedido item : itens) {
            System.out.println(item.getDescricao());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }

    public void pagar() {
        if (status == StatusPedido.PENDENTE) {
            status = StatusPedido.PAGO;
            System.out.println("Pagamento realizado!");
        } else {
            System.out.println("Nao pode pagar agora.");
        }
    }

    public void preparar() {
        if (status == StatusPedido.PAGO) {
            status = StatusPedido.EM_PREPARO;
            System.out.println("Pedido em preparo...");
        } else {
            System.out.println("Pagamento necessario.");
        }
    }

    public void finalizar() {
        if (status == StatusPedido.EM_PREPARO) {
            status = StatusPedido.FINALIZADO;
            System.out.println("Pedido finalizado! Retire no balcão.");
        } else {
            System.out.println("Ainda nao esta pronto.");
        }
    }

    public StatusPedido getStatus() {
        return status;
    }
}
