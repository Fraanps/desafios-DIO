package br.com.fps.livedio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    // TODO: Conhecer e imortar a classe Scanner
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 0.0;

    // Exibir as  mensagens para o nosso usuário

    // Obter pelo scanner os valores digitados no terminal
    System.out.print("Por favor, digite o número da Conta: ");
    numero = sc.nextInt();

    System.out.print("Por favor, digite o número da Agência: ");
    agencia = sc.next();

    System.out.print("Por favor, digite o nome do cliente: ");
    nomeCliente = sc.next();

    System.out.print("Por favor, digite o saldo inicial: ");
    saldo = sc.nextDouble();

    // Exibir a mensagem conta criada
    String mensagem = String.format("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
        "conta %d e seu saldo de %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo );

    System.out.println(mensagem);


  }
}
