import java.util.Scanner;

public class Exercicios_22 {
    public static void fatorial(String[] args){
        // Ler um valor N. Calcular e escrever seu respectivo fatorial.
        // Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        // Lembrando que, por definição, fatorial de 0 é 1.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n == 0){
            n = 1;
        }
        else{
            for (int i = (n - 1); i > 0 ; i--){
                n *= i;
            }
        }
        System.out.println(n);

        sc.close();
    }
}
