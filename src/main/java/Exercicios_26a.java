import java.util.Locale;
import java.util.Scanner;

/*
    Classe com objetivo de calcular a área de 2 triangulos ( X e Y ) e informar qual é o triangulo com a maior área
    Without POO
 */

public class Exercicios_26a {
    public static void calculoTrianguloA(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double p, aY, bY, cY, aX, bX, cX, areaX, areaY;

        System.out.println("Digite as medidas do triangulo X");
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y");
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();

        p = (aX + bX + cX)/2;
        areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));

        p = (aY + bY + cY)/2;
        areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));

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
