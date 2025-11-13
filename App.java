import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n===  LOJA DE GAMES ===");
            System.out.println("\n1 - Cadastrar Jogo");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Editar Jogo");
            System.out.println("4 - Editar Cliente");
            System.out.println("5 - Deletar Jogo");
            System.out.println("6 - Deletar Cliente");
            System.out.println("7 - Listar Jogos");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("");
                    GerenciarListaJogos.Cadastrar();
                    
                    break;
                case 2:
                    System.out.println("");
                    GerenciarListaClientes.CadastrarCliente();
                    break;
                case 3:
                    System.out.println("");
                    GerenciarListaJogos.Editar();
                    break;
                case 4:
                    System.out.println("");
                    GerenciarListaClientes.editarCliente();
                    break;
                case 5:
                    System.out.println("");
                    GerenciarListaJogos.Deletar();
                    break;
                case 6:
                    System.out.println("");
                    GerenciarListaClientes.deletarCliente();
                    break;
                case 7:
                    System.out.println("");
                    GerenciarListaJogos.Listar();
                    break;
                case 8:
                    System.out.println("");
                    GerenciarListaClientes.listarClientes();
                    break;
                case 9:
                    System.out.println("\nPrograma encerrado.");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
        sc.close();
    }
}
