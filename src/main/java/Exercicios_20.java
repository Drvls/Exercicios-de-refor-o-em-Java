import java.util.Locale;
import java.util.Scanner;

public class Exercicios_20 {
    public static void medias(String[] args){
        // Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
        // Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
        // Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
        // primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor te peso 5.
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.UK);

        int x = sc.nextInt();
        double[] media = new double[3];
        for(int i = 0; i < x; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            media[i] = (a * 2 + b * 3 + c * 5) / 10;
        }

        for(double i : media){
            System.out.printf("%.1f%n",i);
        }

        sc.close();
    }
}
