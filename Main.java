// COLABORADORES
// ALAN DE CARVALHO FRANÇA - RA 925106441
// BRUNO PAIVA DOS SANTOS - RA 925102844
// CARLOS HENRIQUE BANDEIRA DA SILVA - RA 925113492
// ERIK CORTE DA SILVA - RA 925108507
// ISAAC OLIVEIRA MATEUS - RA 924209552
// ISABELY CRISTINA RUDENINSKI DE SOUZA - RA 925103925
// JOÃO VICTOR FEITOSA TEIXEIRA - RA 925113684
// MONICA DA PAIXÃO CINTRA - RA 925102444
// NATÃ ABIEL AURELIANO GONÇALVES - RA 925108182
// RAFAEL FRANCISCO DA SILVA LIMA - RA 924209078
// VANESSA COSTA DE ALMEIDA - RA 925102149

// REPOSITÓRIO DO TRABALHO NO GITHUB: https://github.com/Henrique-B98/Trabalho_Sistema_de_Games/blob/main/App.java

import java.util.Scanner;
public class Main {
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
