import java.util.Scanner;

public class Exercicios_6 {
    final static double pi = 3.14159;
    public static void calculos(String[] args){
        // Fazer um programa que leia três valores com ponto flutuante de dupla
        // precisão: A, B e C. Em seguida, calcule e mostre:
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", calcularTriangulo(a, c));
        System.out.printf("CIRCULO: %.3f%n", calcularCirculo(c));
        System.out.printf("TRAPEZIO: %.3f%n", calcularTrapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f%n", calcularQuadrado(b));
        System.out.printf("RETANGULO: %.3f%n", calcularRetangulo(a, b));
    }

    public static double calcularTriangulo(double a, double b){
        return a*b/2;
    }

    public static double calcularCirculo(double a){
        return pi*(a*a);
    }

    public static double calcularTrapezio(double a, double b, double c){
        return ((a+b)*c)/2;
    }

    public static double calcularQuadrado(double a){
        return a*a;
    }

    public static double calcularRetangulo(double a, double b){
        return a*b;
    }
}

