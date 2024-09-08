import java.util.Scanner;

public class Exercicios_4 {
    public static void salario(String[] args){
        // Fazer um programa que leia o número de um funcionário, seu número de horas
        // trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
        // A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        Scanner sc = new Scanner(System.in);

        int funcionarioID, horasTrabalhadas;
        double salarioPorHora;

        funcionarioID = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        salarioPorHora = sc.nextDouble();

        double salario = CalcularSalario(horasTrabalhadas, salarioPorHora);

        System.out.println("NUMBER = " + funcionarioID);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }

    public static double CalcularSalario(int horas, double salario){
        return horas * salario;
    }
}
