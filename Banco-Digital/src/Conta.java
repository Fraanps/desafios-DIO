import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta {

  private static int SEQUENCIAL = 1;
  private static int AGENCIA_PADRAO = 1;

  protected Cliente cliente;
  protected int agencia;
  protected int numConta;
  protected double saldo;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numConta = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valorSaque) {
    if (valorSaque > 0 && valorSaque <= saldo) {
      this.saldo -= valorSaque;
      System.out.println("Saque realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente");
    }

  }

  @Override
  public void depositar(double valorDeposito) {
    if (valorDeposito > 0) {
      this.saldo += valorDeposito;
    } else {
      System.out.println("Valor de depósito inválido");
    }

  }

  @Override
  public void transferir(double valorTransferencia, Conta contaDestino) {

    if (valorTransferencia > 0 && valorTransferencia <= saldo) {
      this.sacar(valorTransferencia);
      contaDestino.depositar(valorTransferencia);
    } else {
      System.out.println("Saldo insuficiente para transferir");
    }
  }

  protected void imprimirInfosComuns(){
    System.out.println(String.format("Agencia: %s", this.agencia));
    System.out.println(String.format("Conta: %d", this.numConta));
    System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
  }

  public abstract void extrato();
}
