public class ClientePremium extends Cliente {
    private String categoria="Premium";

    public ClientePremium(int id, String nome, String email, double saldo) {
        super(id, nome, email, saldo);
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Categoria: " + categoria);
    }
    @Override
    public void exibirInfoEditar() {
        super.exibirInfoEditar();
        System.out.println("4 - Categoria: " + categoria);
    }
    @Override
    public  void validarSaldo(Cliente cliente) throws Cliente.conferenciaSaldoException {
        cliente.setSaldo(cliente.getSaldo() * 1.1);
        super.validarSaldo(cliente);
    }
}
