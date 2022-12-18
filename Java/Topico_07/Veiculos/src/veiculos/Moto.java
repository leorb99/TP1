/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author leo_r
 */
public class Moto extends Veiculo{
    private int cilindradas;
    
    public Moto(){
        
    }
    
    public Moto(String placa, int numeroPortas, float preco, int cilindradas){
        super(placa, numeroPortas, preco);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    
    public String toString(){
        String moto;
        moto = super.toString();
        moto += "Quantidade de cilindradas: " + cilindradas;
        return moto;
    }
}
