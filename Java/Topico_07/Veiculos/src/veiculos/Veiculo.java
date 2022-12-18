/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author leo_r
 */
public class Veiculo {
    protected String placa;
    protected int numeroPortas;
    protected float preco;
    
    public Veiculo(){
        
    }
    
    public Veiculo(String placa, int numeroPortas, float preco){
        this.placa = placa;
        this.numeroPortas = numeroPortas;
        this.preco = preco;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public int getNumeroPortas(){
        return numeroPortas;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public String toString(){
        String veiculo;
        veiculo = "Placa: " + placa + "Número de portas: " + numeroPortas + "Preço: R$" + preco;
        return veiculo;
    }   
}
