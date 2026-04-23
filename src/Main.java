import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto cafe = new Produto("Cafe Expresso", 5.0);
        Produto pao = new Produto("Pao de Queijo", 4.5);
        Produto cappuccino = new Produto("Cappuccino", 7.0);

        Pedido pedido = new Pedido();

        int opcao;

        do {
            System.out.println("\n=== CAFE EXPRESSO ☕ ===");
            System.out.println("1 - Adicionar Cafe");
            System.out.println("2 - Adicionar Pao de Queijo");
            System.out.println("3 - Adicionar Cappuccino");
            System.out.println("4 - Ver Pedido");
            System.out.println("5 - Pagar");
            System.out.println("6 - Enviar para Preparo");
            System.out.println("7 - Finalizar Pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Quantidade: ");
                    pedido.adicionarItem(cafe, scanner.nextInt());
                    break;

                case 2:
                    System.out.print("Quantidade: ");
                    pedido.adicionarItem(pao, scanner.nextInt());
                    break;

                case 3:
                    System.out.print("Quantidade: ");
                    pedido.adicionarItem(cappuccino, scanner.nextInt());
                    break;

                case 4:
                    pedido.mostrarPedido();
                    break;

                case 5:
                    pedido.pagar();
                    break;

                case 6:
                    pedido.preparar();
                    break;

                case 7:
                    pedido.finalizar();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
