import java.util.Scanner;

public class Exercicios_3 {

    public static void diferenca(String[] args){
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule
        // e mostre a diferença do produto A e B pelo produto de C e D segundo a fórmula:
        // DIFERENCA = (A * B - C * D).
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, result;
        System.out.println("Insira os números");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        result = CalcularDiferenca(a, b, c, d);
        System.out.println("Resultado: " + result);
    }

    public static int CalcularDiferenca(int a, int b, int c, int d){
        return (a*b) - (c*d);
    }
}
