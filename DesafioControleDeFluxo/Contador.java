package desafios.DesafioControleDeFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        int param1 = terminal.nextInt();
        int param2 = terminal.nextInt();
        
        try{
            // chamando o método contendo a lógica da contagem
            contar(param1, param2);
        } catch(ParametrosInvalidosException e){
            // imprimir a mensagem: o segundo parametro deve ser maior que o primeiro
            System.out.println(e.getMessage());

        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        // validar se o parametro um é maior que o parametro dois e lançar a exceção
        if (param1 > param2){
            throw new ParametrosInvalidosException();
        }

        int contagem = param2 - param1;
        // realizar o for para imprimir os números com base na váriavel contagem
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " +i);
        }
    }
}
