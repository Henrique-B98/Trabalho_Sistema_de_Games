import java.util.*;

public class GerenciarListaJogos {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Jogo> Jogos = new ArrayList<>();
    private static int op;
    private static int Id = 1;

    public static void Cadastrar(){
        Jogo J = new Jogo();
        J.setId(Id++);
        System.out.print("\nInforme o nome do jogo:\n> ");
        J.setNome(sc.nextLine());
        System.out.print("\nInforme o gênero do jogo\n> ");
        J.setGenero(sc.nextLine());
        System.out.print("\nInforme o ano de lançamento do jogo\n> ");
        J.setAno(sc.nextInt());
        System.out.print("\nInforme o preço do jogo\n> ");
        J.setPreco(sc.nextFloat());
        System.out.print("\nInforme o status do jogo\n1 - Disponível\n2 - Indisponível\n> ");
        switch (sc.nextInt()){
            case 1:
                J.setStatus("Disponível");
                break;
            case 2:
                J.setStatus("Indisponível");
                break;
            default:
                System.out.println("\nValor inválido!");
            }
        sc.nextLine();
        Jogos.add(J);
        System.out.println("\nCadastro finalizado!");
    }

    public static void Editar(){
        System.out.println("\nEscolha o ID do jogo para editar");
        for(Jogo j : Jogos){
            System.out.println(j.getId() + " - " + j.getNome());
        }
        System.out.print("\n> ");
        int idEditar = sc.nextInt();
        sc.nextLine();
        if(idEditar > Jogos.size() || idEditar <= 0){
            System.out.println("\nValor inválido!");
        } else {
            System.out.println("\n--- Escolha um atributo para editar ---");
            System.out.print("1 - Nome\n2 - Gênero\n3 - Ano\n4 - Preço\n5 - Status\n> ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.print("\nInforme o nome do jogo:\n> ");
                    String nome = sc.nextLine();
                    for(Jogo j : Jogos){
                        if(j.getId() == idEditar){
                            j.setNome(nome);
                        }
                    }
                    System.out.println("\nEdição finalizada!");
                    break;

                case 2:
                    System.out.print("\nInforme o gênero do jogo\n> ");
                    String genero = sc.nextLine();
                    for(Jogo j : Jogos){
                        if(j.getId() == idEditar){
                            j.setGenero(genero);
                        }
                    }
                    System.out.println("\nEdição finalizada!");
                    break;

                case 3:
                    System.out.print("\nInforme o ano de lançamento do jogo\n> ");
                    int ano = sc.nextInt();
                    for(Jogo j : Jogos){
                        if(j.getId() == idEditar){
                            j.setAno(ano);
                        }
                    }
                    System.out.println("\nEdição finalizada!");
                    break;

                case 4:
                    System.out.print("\nInforme o preço do jogo\n> ");
                    double preco = sc.nextFloat();
                    for(Jogo j : Jogos){
                        if(j.getId() == idEditar){
                            j.setPreco(preco);
                        }
                    }
                    System.out.println("\nEdição finalizada!");
                    break;

                case 5:
                    String status;
                    System.out.print("\nInforme o status do jogo\n1 - Disponível\n2 - Indisponível\n> ");
                    if(sc.nextInt() == 1){
                        status = "Disponível";
                    } else {
                        status = "Indisponível";
                    }
                    for(Jogo j : Jogos){
                        if(j.getId() == idEditar){
                            j.setStatus(status);
                        }
                    }
                    System.out.println("\nEdição finalizada!");
                    break;

                default:
                    System.out.println("\nValor inválido!");
                    break;
            }
        }
    }
    public static void Deletar(){
        System.out.println("\n--- Escolha o ID do jogo para deletar ---");
        for(Jogo j : Jogos){
            System.out.println(j.getId() + " - " + j.getNome());
        }
        System.out.print("\n> ");
        op = sc.nextInt();
        sc.nextLine();
        for(Jogo j : Jogos){
            if(j.getId() == op){
                Jogos.remove(j);
                break;
            }
        }
        System.out.println("\nJogo Deletado!");
    }

    public static void Listar(){
        for(Jogo j : Jogos){
            System.out.println("\n");
            j.exibirDados();
        }
    }
}