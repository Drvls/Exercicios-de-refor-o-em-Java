// Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
// seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
// salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
// afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
// projetada abaixo.

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Exercicios_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee clt = new Employee();
        Locale.setDefault(Locale.US);

        System.out.print("Name: ");
        clt.name = sc.nextLine();

        System.out.print("Gross salary: ");
        clt.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        clt.tax = sc.nextDouble();

        System.out.println("Employee: " + clt);
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        clt.IncreaseSalary(percentage);
        System.out.println("Updated data: " + clt);
    }
}
