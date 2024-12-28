import java.util.Scanner;

public class Exercicios_24 {
    public static void positivos(String[] args){
        // Fazer um programa para ler um número inteiro positivo N. O programa deve então
        // mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número
        // da linha, depois o quadrado e o cubo do valor, conforme exemplo.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int linha, quadrado, cubo;
        for(int i = 1 ; i <= n ; i++){
            linha = i;
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%d %d %d%n", linha, quadrado, cubo);
        }

        sc.close();
    }
}
