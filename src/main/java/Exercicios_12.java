import java.util.Scanner;

public class Exercicios_12 {
    public static void intervalo(String[] args){
        // Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
        // dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
        // este valor se encontra. Obviamente se o valor não estiver em nenhum destes
        // intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        // Entrada: 25.01 / Saída: Intervalo (25,50]
        Scanner sc = new Scanner(System.in);

        double intervalo = sc.nextDouble();

        // A opção de eliminar os valores fora de intervalo como primeiro if foi como decisão
        // de não repetir código nas condições adiantes de if else, ex: intervalo < 0,00
        if(intervalo < 0.00 || intervalo > 100.00){
            System.out.println("Fora de intervalo");
        }
        else if(intervalo <= 25.00){
            System.out.println("Intervalo [0,25]");
        }
        else if(intervalo <= 50.00){
            System.out.println("Intervalo (25,50]");
        }
        else if(intervalo <= 75.00){
            System.out.println("Intervalo (50,75]");
        }
        else{
            System.out.println("Intervalo (75,100]");
        }
    }
}
