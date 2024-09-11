import java.util.Scanner;

public class Exercicios_7 {
    public static void negativo(String[] args){
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é
        // negativo ou não.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        if(n1 >= 0){
            System.out.println("NAO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }
}
