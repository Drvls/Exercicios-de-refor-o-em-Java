import java.util.Scanner;

public class Exercicios_5 {
    public static void peca(String[] args){
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor
        // unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor
        // unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Scanner sc = new Scanner(System.in);

        int pecaId, quantidadePeca;
        double valor, resultado;
        double[] valores = {0, 0};

        for(int i = 0; i < 2 ; i++){
            pecaId = sc.nextInt();
            quantidadePeca = sc.nextInt();
            valor = sc.nextDouble();

            valores[i] = calcularValor(quantidadePeca, valor);
        }

        resultado = valores[0] + valores[1];
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);
    }

    public static double calcularValor(int quantidade, double valor){
        return valor*quantidade;
    }
}
