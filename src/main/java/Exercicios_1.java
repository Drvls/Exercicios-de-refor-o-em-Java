import java.util.Scanner;

public class Exercicios_1 {
    public static void soma(String[] args){
        Scanner sc = new Scanner(System.in);

        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses
        // números com uma mensagem explicativa, conforme exemplos.

        // Exemplos:
        // Entrada 10 e 30 = 40 / -30 e 10 = -20 / 0 e 0 = 0

        int n1, n2;

        for (int i = 0; i < 3; i++){
            System.out.println("First number");
            n1 = sc.nextInt();
            System.out.println("Second number");
            n2 = sc.nextInt();
            System.out.println("Resultado: " + somar(n1, n2));
        }
    }

    public static int somar(int n1, int n2){
        return n1 + n2;
    }
}
