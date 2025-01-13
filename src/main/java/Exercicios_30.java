// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//resolver este problema.Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//resolver este problema.

import java.util.Scanner;
import java.util.Locale;
import entities.Student;


public class Exercicios_30 {
    public static void studentGrades(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student st = new Student();

        st.name = sc.nextLine();
        st.firstQuarter = sc.nextDouble();
        st.secondQuarter = sc.nextDouble();
        st.thirdQuarter = sc.nextDouble();

        System.out.println(st);
        if (st.calculateFinalGrade() < 60){
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", st.calculateMissingPoints()) + " POINTS");
        }
        else{
            System.out.println("PASS");
        }
    }
}
