public class Main {
    public static void main(String[] args) {

        // Criando produtos (cardápio)
        Produto cafe = new Produto("Café Expresso", 5.00);
        Produto pao = new Produto("Pão de Queijo", 4.50);

        // Criando pedido
        Pedido pedido = new Pedido();

        // Adicionando itens
        pedido.adicionarItem(cafe, 2);
        pedido.adicionarItem(pao, 3);

        // Exibindo total
        System.out.println("Total: R$ " + pedido.calcularTotal());

        // Fluxo do pedido
        pedido.pagar();
        pedido.enviarParaCozinha();
        pedido.finalizarPedido();

        System.out.println("Status final: " + pedido.getStatus());
    }
}
