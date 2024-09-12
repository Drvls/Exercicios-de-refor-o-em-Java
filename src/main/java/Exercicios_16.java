import java.util.Scanner;

public class Exercicios_16 {
    public static void cartesiano(String[] args){
        // Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
        // indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
        // quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma
        // de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;
        boolean loop = true;
        while(loop){
            x = sc.nextInt();
            y = sc.nextInt();

            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if(x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if(x < 0 && y < 0){
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }else{
                loop = false;
            }
        }

        sc.close();
    }
}
