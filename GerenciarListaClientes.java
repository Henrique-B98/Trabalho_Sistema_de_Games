import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarListaClientes {
        private static ArrayList<Cliente> clientes = new ArrayList<>();
        private static int id= 0;
        private static Scanner sc = new Scanner(System.in);

    public static void CadastrarCliente() {
        
        System.out.println("### Clientes Premium Ganham 10 % a mais de Saldo ao realizar o Cadastro ###");
        System.out.println("\nDigite \n1 - Para um Cliente Regular / 2 - Para um Cliente Premium:");
        int tipoCliente = sc.nextInt();
        sc.nextLine();
        System.out.println();
        if (tipoCliente == 1) {
            System.out.println("Cadastro de Cliente Regular");
            System.out.println("-------------------");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Email: " );
            String email = sc.nextLine();
            System.out.println("Saldo: ");
            double saldo = sc.nextDouble();
            id++;
            ClienteRegular clienteRegular = new ClienteRegular(id, nome, email, saldo);
            try {
                clienteRegular.validarSaldo(clienteRegular);
            } catch (Cliente.conferenciaSaldoException e) {
                System.out.println(e.getMessage());
            }
            clientes.add(clienteRegular);
            System.out.println("-------------------");
            System.out.println("Cliente " + clienteRegular.getNome() + " cadastrado com sucesso!");
            System.out.println("-------------------");
            return; 
        }if (tipoCliente == 2) {
            System.out.println("Cadastro de Cliente Premium");
            System.out.println("-------------------");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Email: " );
            String email = sc.nextLine();
            System.out.println("Saldo: ");
            double saldo = sc.nextDouble();
            id++;
            ClientePremium clientePremium = new ClientePremium(id, nome, email, saldo);
            try {
                clientePremium.validarSaldo(clientePremium);
            } catch (Cliente.conferenciaSaldoException e) {
                System.out.println(e.getMessage());
            }
            clientes.add(clientePremium);
            System.out.println("-------------------");
            System.out.println("Cliente " + clientePremium.getNome() + " cadastrado com sucesso!");
            System.out.println("-------------------");
            return;
        }else {
            System.out.println("ERRO, Opção inválida!");
            return;
        }
    }
    public static void deletarCliente() {
        listarClientes();
        System.out.println("Digite o ID do cliente a ser deletado: ");
        int idDeletar = sc.nextInt();
        Cliente clienteParaDeletar = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idDeletar) {
                clienteParaDeletar = cliente;
                break;
            }
        }
        if (clienteParaDeletar != null) {
            clientes.remove(clienteParaDeletar);
            System.out.println("Cliente com ID " + idDeletar + " deletado com sucesso.");
        } else {
            System.out.println("Cliente com ID " + idDeletar + " não encontrado.");
        }
    }
    public static void listarClientes() {
        System.out.println("Lista de Clientes\n");
            for (Cliente cliente : clientes) {
            cliente.exibirInfo();
            System.out.println("-------------------");
        }
    }
    public static void editarCliente() {
        listarClientes();
        System.out.println("Digite o ID do cliente a ser editado: ");
        int idEditar = sc.nextInt();
        sc.nextLine();
        Cliente clienteParaEditar = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idEditar) {
                clienteParaEditar = cliente;
                int opcaoEditar;
                do{
                System.out.println("");
                cliente.exibirInfoEditar();
                System.out.println(" 5 - Sair");
                System.out.println("");
                System.out.println("Selecione o campo para editar ou digite 5 para voltar ao Menu: ");
                opcaoEditar = sc.nextInt();
                sc.nextLine();
                switch (opcaoEditar) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String novoNome = sc.nextLine();
                        cliente.setNome(novoNome);
                        System.out.println("\nCliente editado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Digite o novo email: ");   
                        String novoEmail = sc.nextLine();
                        cliente.setEmail(novoEmail);
                        System.out.println("\nCliente editado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o novo saldo: ");
                        double novoSaldo = sc.nextDouble();
                        cliente.setSaldo(novoSaldo);
                        System.out.println("\nCliente editado com sucesso!");
                        break; 
                    case 4:
                        System.out.println("Digite: \n1 - Para para Cliente Regular / 2 - Para para Cliente Premium:");
                        int tipoClienteMudar = sc.nextInt();
                        sc.nextLine();
                        if (tipoClienteMudar == 1) {
                            ClienteRegular clienteRegular = new ClienteRegular(clienteParaEditar.getId(), clienteParaEditar.getNome(), clienteParaEditar.getEmail(), clienteParaEditar.getSaldo());
                            clientes.remove(clienteParaEditar);
                            clientes.add(clienteRegular);
                            cliente=clienteRegular;
                            System.out.println("Cliente atualizado para Regular com sucesso!");
                        } else if (tipoClienteMudar == 2) {
                            ClientePremium clientePremium = new ClientePremium(clienteParaEditar.getId(), clienteParaEditar.getNome(), clienteParaEditar.getEmail(), clienteParaEditar.getSaldo());
                            clientes.remove(clienteParaEditar);
                            clientes.add(clientePremium);
                            cliente=clientePremium;
                            System.out.println("Cliente atualizado para Premium com sucesso!");
                        } else {
                            System.out.println("ERRO, Opção inválida!");
                            return;
                        }
                    break;
                    case 5:
                        System.out.println("Edição finalizada.");  
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
                }while(opcaoEditar !=5);

                break;
            }
        }
    }
}
