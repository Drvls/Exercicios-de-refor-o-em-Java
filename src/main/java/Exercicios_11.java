import java.util.Scanner;

public class Exercicios_11 {
    public static void tabela(String[] args){
        // Com base na tabela abaixo, escreva um programa que leia o código de um item e a
        // quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
        // 1    Cachorro quente     R$ 4.00
        // 2    X-Salada            R$ 4.50
        // 3    X-Bacon             R$ 5.00
        // 4    Torrada Simples     R$ 2.00
        // 5    Refrigerante        R$ 1.50
        Scanner sc = new Scanner(System.in);

        int produto, quantidade;
        double valor = 0, total;
        produto = sc.nextInt();
        quantidade = sc.nextInt();

        if(produto > 5 || produto < 1){
            System.out.println("Deve inserir uma opção de 1 a 5");
        }else if(quantidade < 1){
            System.out.println("A quantidade minima é 1");
        }else{
            switch (produto){
                case 1:
                    valor = 4.00;
                    break;
                case 2:
                    valor = 4.50;
                    break;
                case 3:
                    valor = 5.00;
                    break;
                case 4:
                    valor = 2.00;
                    break;
                case 5:
                    valor = 1.50;
                    break;
            }

            total = valor * quantidade;
            //Total: R$ 10.00
            System.out.printf("Total: R$ %.2f%n", total);
        }
    }
}
