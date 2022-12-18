package empresa1;

public class Produto implements Classificavel{
    private int cod;
    private String nome;
    private double preco;

    public Produto(int cod, String nome, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }
    
    public boolean menorElemento(Classificavel obj){
        Produto compara = (Produto) obj;
        return this.cod < compara.cod;
    }

    @Override
    public String toString() {
        return cod + " " + nome + " " + preco;
    }
    
}
