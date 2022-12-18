package empresa1;

public class Cliente implements Classificavel{
    private String cpf, nome, endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public boolean menorElemento(Classificavel obj){
        Cliente compara = (Cliente) obj;
        return this.nome.compareTo(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return cpf + " " + nome + " " + endereco;
    }
    
}
