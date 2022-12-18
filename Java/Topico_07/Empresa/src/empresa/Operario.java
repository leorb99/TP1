package empresa;

public class Operario extends Funcionario{
    private float valorProducao;
    private int qtdProduzida;

    public Operario() {
    
    }

    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int qtdProduzida) {
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.qtdProduzida = qtdProduzida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }
}
