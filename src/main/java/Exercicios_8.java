import java.util.Scanner;

public class Exercicios_8 {
    public static void impar(String[] args){
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
