import java.util.Locale;
import java.util.Scanner;

public class Exercicios_25 {
    public static void fahrenheit(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double celsius;
        double fahrenheit;
        boolean repeticao = true;
        char repetir;

        do {
            System.out.print(" Digite a temperatura em Celsius: ");
            celsius = sc.nextDouble();
            fahrenheit = calcularCelsiusParaFahrenheit(celsius);
            System.out.printf(" Equivalente em Fahrenheit: %.1f", fahrenheit);

            System.out.printf("%n Deseja repetir (s/n)? ");
            repetir = sc.next().charAt(0);
            if(repetir == 'n'){
                repeticao = false;
            }
        }
        while (repeticao);
    }

    public static double calcularCelsiusParaFahrenheit (double celsius){
        return celsius * 1.8 + 32.0;
    }
}
