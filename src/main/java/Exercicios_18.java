import java.util.Scanner;

public class Exercicios_18 {
    public static void impares(String[] args){
        // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
        // um valor por linha, inclusive o X, se for o caso.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
