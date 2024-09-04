public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public ContaPoupanca(Cliente cliente, Double saldo) {
    super(cliente);
    super.saldo = saldo;
  }

  @Override
  public void extrato() {
    System.out.println("*** Extrato Bancário de Conta Poupanca ***");
    imprimirInfosComuns();
  }
}
