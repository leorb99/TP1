/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package veiculos;

import java.util.Scanner;

class Veiculo{
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
        veiculo = "Placa: " + placa + " Número de portas: " + numeroPortas + " Preço: R$" + preco + " ";
        return veiculo;
    }
}

class Carro extends Veiculo{
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

class Moto extends Veiculo{
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

public class Veiculos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Moto moto = new Moto();
    
        String placaVeiculo = input.next();
        int numPortasVeiculo = input.nextInt();
        float precoVeiculo = input.nextFloat();
        
        veiculo.setPlaca(placaVeiculo);
        veiculo.setNumeroPortas(numPortasVeiculo);
        veiculo.setPreco(precoVeiculo);
        
        String placaCarro = input.next();
        int numPortasCarro = input.nextInt();
        float precoCarro = input.nextFloat();
        String cor = input.next();
        
        carro.setPlaca(placaCarro);
        carro.setNumeroPortas(numPortasCarro);
        carro.setPreco(precoCarro);
        carro.setCor(cor);
        
        String placaMoto = input.next();
        int numPortasMoto = input.nextInt();
        float precoMoto = input.nextFloat();
        int cilindradas = input.nextInt();
        
        moto.setPlaca(placaMoto);
        moto.setNumeroPortas(numPortasMoto);
        moto.setPreco(precoMoto);
        moto.setCilindradas(cilindradas);
        
        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);

    }
}