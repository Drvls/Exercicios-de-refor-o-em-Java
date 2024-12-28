import java.util.Scanner;

public class Exercicios_23 {
    public static void divisores(String[] args){
        // Ler um número inteiro N e calcular todos os seus divisores.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
