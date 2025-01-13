import java.util.Scanner;

import entities.Produto;

public class Exercicios_27 {
    public static void produtos(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.valor = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println(" ");
        System.out.println(produto);
        System.out.println(" ");
        System.out.print("Digite o numero de produtos para adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarQuantidade(quantidade);
        System.out.println(" ");
        System.out.println(produto);
        System.out.println(" ");

        System.out.print("Digite o numero de produtos para remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removerQuantidade(quantidade);
        System.out.println(" ");
        System.out.println(produto);
    }
}
