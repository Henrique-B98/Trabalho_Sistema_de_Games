public class Jogo {
    private int Id;
    private String nome;
    private String genero;
    private int ano;
    private double preco;
    private String status;

    public int getId(){
        return Id;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public int getAno(){
        return ano;
    }

    public double getPreco(){
        return preco;
    }

    public String getStatus(){
        return status;
    }

    public void setId(int x){
        Id = x;
    }

    public void setNome(String x){
        if(x != "" || x != null){
            nome = x;
        } else {
            System.out.println("\nINPUT INVÁLIDO!");
        }
    }

    public void setGenero(String x){
        if(x != "" || x != null){
            genero = x;
        } else {
            System.out.println("\nINPUT INVÁLIDO!");
        }
    }

    public void setAno(int x){
        if(x > 0 && x < 2025){
            ano = x;
        } else {
            System.out.println("\nINPUT INVÁLIDO!");
        }
    }

    public void setPreco(double x){
        if(x >= 0){
            preco = x;
        } else {
            System.out.println("\nINPUT INVÁLIDO!");
        }
    }

    public void setStatus(String x){
        if(x != "Disponível" || x != "Indisponível"){
            status = x;
        } else {
            System.out.println("\nINPUT INVÁLIDO!");
        }
    }

    public void exibirDados(){
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Ano: " + getAno());
        System.out.printf("Preço: %.2f%n", getPreco());
        System.out.println("Status: " + getStatus());
    }
}