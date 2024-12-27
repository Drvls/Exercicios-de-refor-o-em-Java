import java.util.Scanner;

public class Exercicios_22 {
    public static void fatorial(String[] args){
        // Ler um valor N. Calcular e escrever seu respectivo fatorial.
        // Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        // Lembrando que, por definição, fatorial de 0 é 1.
        Scanner sc = new Scanner(System.in);

        // INCOMPLETO EXERCICIO FOR 5

        int n = sc.nextInt();
        for (int i = (n - 1); i > 0 ; i--){
            n *= i;
        }

        n = n == 0 ? 1 : n;
        System.out.println(n);

        sc.close();
    }
}
