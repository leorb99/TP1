
package fourseasoning;

import java.util.ArrayList;


public class Pedido {
    private double total;
    private Conta conta;
    private Funcionario funcionario;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }
    
    public Pedido(double total, Conta conta, Funcionario funcionario) {
        this.total = total;
        this.conta = conta;
        this.funcionario = funcionario;
        this.itens = new ArrayList<>();
    }
    // Calcula o valor total considerando o array de itens pedidos
    public double calcularTotal(){
        double valorTotal = 0;
        for(ItemPedido i: itens){
            valorTotal += i.getSubtotal();
        }
        return valorTotal;
    }
    // Calcula o valor total considerando o array de itens pedidos, dessa vez 
    // considerando a categoria da conta para oferecer um desconto
    public double calcularTotalCDesconto(){
        double valorTotal = 0;
        for(ItemPedido i: itens){
            valorTotal += i.getSubtotal();
        }
        if(getConta().getCategoria().equals("Standard")){
            return valorTotal * 0.7;
        }else if(getConta().getCategoria().equals("Premium")){
            return valorTotal * 0.5;
        }return valorTotal;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList getItemPedido() {
        return itens;
    }

    public void setItemPedido(ArrayList prato) {
        this.itens = prato;
    }
    
    
}
