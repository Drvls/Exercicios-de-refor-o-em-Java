import java.util.Scanner;

import entities.Retangulo;

// Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar
// na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.

public class Exercicios_28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e a altura do retangulo:");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println("Area = " + retangulo.calcularArea());
        System.out.println("Perimetro = " + retangulo.calcularPerimetro());
        System.out.println("Diagonal = " + retangulo.calcularDiagonal());
    }
}
