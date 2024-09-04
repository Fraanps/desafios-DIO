public class Main {
  public static void main(String[] args) {
    Conta cc = new ContaCorrente(new Cliente("João", "0000", "9999", "Rua 1" ));
    cc.depositar(100);

    Conta cp = new ContaPoupanca(new Cliente("Maria", "0000", "9999", "Rua 1" ), 50.0);

    cc.extrato();
    cc.transferir(50, cp);

    cc.extrato();
    cp.extrato();
  }
  
}