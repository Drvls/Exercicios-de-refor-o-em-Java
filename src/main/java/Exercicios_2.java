import java.util.Scanner;

public class Exercicios_2 {
    static final double pi = 3.14159;

    public static void area(String[] args){
        Scanner sc = new Scanner(System.in);

        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor
        // da área deste círculo com quatro casas decimais conforme exemplos.

        //Fórmula da área: area = π . raio²
        //Considere o valor de π = 3.14159

        double raio = sc.nextDouble();
        double resultado = CalcularArea(raio);
        System.out.printf("%.4f%n", resultado);
    }

    public static double CalcularArea(double raio){
        return pi*(raio*raio);
    }
}
