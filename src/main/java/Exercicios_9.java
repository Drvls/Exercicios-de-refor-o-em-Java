import java.util.Scanner;

public class Exercicios_9 {
    public static void multiplos(String[] args){
        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao
        // Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos
        // entre si. Atenção: os números devem poder ser digitados em ordem crescente ou
        // decrescente.
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
    }
}
