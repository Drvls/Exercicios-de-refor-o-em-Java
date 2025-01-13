package entities;

public class Produto {
    public String nome;
    public double valor;
    public int quantidade;

    public double calcularTotal(){
        return valor * quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                + ", R$ "
                + String.format("%.2f", valor)
                + ", "
                + quantidade
                + " unidades, Total: R$"
                + String.format("%.2f", calcularTotal());
    }
}
