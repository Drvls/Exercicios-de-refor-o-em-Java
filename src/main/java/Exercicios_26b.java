import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

/*
    Classe com objetivo de calcular a área de 2 triangulos ( X e Y ) e informar qual é o triangulo com a maior área
    With POO
 */

public class Exercicios_26b {
    public static void calculoTrianguloB(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do Triangulo X: %.4f%n", areaX);
        System.out.printf("Area do Triangulo Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Area maior: X");
        }
        else{
            System.out.println("Area maior: Y");
        }
    }
}
