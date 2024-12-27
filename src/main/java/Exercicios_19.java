import java.util.Scanner;

public class Exercicios_19 {
    public static void inOut(String[] args){
        // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que
        // serão lidos em seguida. Mostre quantos destes valores X estão dentro do
        // intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações
        // conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        Scanner sc = new Scanner(System.in);

        int n;
        int in = 0;
        int out = 0;
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++){
            n = sc.nextInt();

            if(n >= 10 && n <= 20){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
