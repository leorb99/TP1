package empresa;

public class Vendedor extends Funcionario{
    private float comissaoVenda;
    private int qtdVendas;

    public Vendedor() {
    
    }

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int qtdVendas) {
        super(nome, dataNascimento, salario);
        this.comissaoVenda = comissaoVenda;
        this.qtdVendas = qtdVendas;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}
