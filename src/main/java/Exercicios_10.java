import java.util.Scanner;

public class Exercicios_10 {
    public static void jogadas(String[] args){
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
        // jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
        // duração mínima de 1 hora e máxima de 24 horas.
        Scanner sc = new Scanner(System.in);

        final int dia = 24;
        int n1, n2, horasJogadas;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        // min 1h & max 24h
        if(n1 + n2 > 24 || n1 < 0 || n2 < 0){
            System.out.println("O horário deve ser maior que 1 hora e menor que 24 horas");
        }
        else{
            // 16 2 = 10h
            if(n1 > n2){
                horasJogadas = (dia - n1) + 2;
                System.out.printf("O JOGO DUROU %d HORA(S)", horasJogadas);
            } // 2 16 = 14h
            else if(n2 > n1){
                horasJogadas = n2 - n1;
                System.out.printf("O JOGO DUROU %d HORA(S)", horasJogadas);
            } // 0 0 = 24h
            else{
                horasJogadas = 24;
                System.out.printf("O JOGO DUROU %d HORA(S)", horasJogadas);
            }
        }
    }
}
