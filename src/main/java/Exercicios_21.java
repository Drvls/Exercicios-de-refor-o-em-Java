import java.util.Locale;
import java.util.Scanner;

public class Exercicios_21 {
    public static void divisor(String[] args){
        // Fazer um programa para ler um número N. Depois leia N pares de números e
        // mostre a divisão do primeiro pelo segundo. Se o denominador for igual a
        // zero, mostrar a mensagem "divisao impossivel".
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double divisao = 0;
        for(int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble()
                    ;
            if(b == 0){
                System.out.println("divisao impossivel");
            }
            else{
                divisao = a / b;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}
