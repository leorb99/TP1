package empresa1;

public class Servico implements Classificavel{
    private String data, tipoServico;
    private double preco;

    public Servico(String data, String tipoServico, double preco) {
        this.data = data;
        this.tipoServico = tipoServico;
        this.preco = preco;
    }
    
    public boolean menorElemento(Classificavel obj){
        Servico compara = (Servico) obj;
        return this.preco < compara.preco;
    }
    
    @Override
    public String toString(){
        return tipoServico + " " + preco + " " + data;
    }
}
