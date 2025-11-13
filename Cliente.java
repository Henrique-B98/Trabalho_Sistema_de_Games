public class Cliente {
    private int id;
    private String nome;
    private String email;
    private double saldo;
    
    public Cliente(int id, String nome, String email, double saldo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void exibirInfo() {
        System.out.println(" ID: " + id);
        System.out.println(" Nome: " + nome);
        System.out.println(" Email: " + email);
        System.out.printf(" Saldo: R$ %.2f%n ",saldo);
    }
    public void exibirInfoEditar() {
        System.out.println(" 1 - Nome: " + nome);
        System.out.println(" 2 - Email: " + email);
        System.out.printf(" 3 - Saldo: R$ %.2f%n ",saldo);
    }
    public static class conferenciaSaldoException extends Exception {
        public conferenciaSaldoException(String mensagem) {
            super(mensagem);
        }
    }
    public void validarSaldo(Cliente cliente) throws conferenciaSaldoException {
        if (cliente.getSaldo()<0) {
            cliente.setSaldo(0);
            throw new conferenciaSaldoException("Valor do saldo tem que ser maior ou igual a 0.");
        }
        cliente.setSaldo(cliente.getSaldo());
    }
}
