/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author leo_r
 */
public class Carro extends Veiculo{
    private String cor;
    
    public Carro(){
        
    }
    
    public Carro(String placa, int numeroPortas, float preco, String cor){
        super(placa, numeroPortas, preco);
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String toString(){
        String carro;
        carro = super.toString();
        carro += "Cor: " + cor;
        return carro;
    }
}
