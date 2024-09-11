import java.util.Scanner;

public class Exercicios_14 {
    public static void imposto(String[] args){
        // Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de
        // Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
        // Imposto de Renda, segundo a tabela abaixo.

        // Renda				        Imposto
        //de 0.0 a R$2000.00		    Isento
        //de R$ 2000.01 até R$ 3000.00	8%
        //de R$ 3000.01 até R$ 4500.00	18%
        //acima de R$ 4500.00		    28%

        // Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre
        // R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de
        // Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 +
        // 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso
        // com duas casas decimais.
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        // Isento
        if(salario <= 2000.00){
            System.out.println("Isento");
        }
        // 8%
        else if(salario > 2000.00 && salario <= 3000.00){
            imposto = 8/100 * (salario - 2000);
            System.out.printf("R$ %.2f%n", imposto);
        }
        // 18%
        else if(salario > 3000.00 && salario <= 4500.00){
            salario -= 3000; // isenção + 8% de imposto
            imposto = 80; // 8% de 1000 = 80
            imposto += 18 * salario / 100;
            System.out.printf("R$ %.2f%n", imposto);
        }
        // 28%
        else{
            salario -= 4500; // isenção + 8% + 18%
            imposto = 80 + 270; // 8% de 1000 = 80 / 18% de 1500 = 270;
            imposto += 28 * salario / 100;
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
