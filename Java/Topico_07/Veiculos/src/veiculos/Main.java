/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

import java.util.Scanner;

/**
 *
 * @author leo_r
 */
public class Main {
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

/*
BRA1E10 2 2500
ABC1D34 4 50000 Branco
EFG2H23 0 20000 150

Placa: BRA1E10 Número de portas: 2 Preço: R$2500.0
Placa: ABC1D34 Número de portas: 4 Preço: R$50000.0 Cor: Branco
Placa: EFG2H23 Número de portas: 0 Preço: R$20000.0 Quantidade de cilindradas: 150
*/