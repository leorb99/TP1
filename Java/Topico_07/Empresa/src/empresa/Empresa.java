package empresa;

import java.util.Scanner;


public class Empresa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeEmpresa, cidadeEmpresa, mesPagamento,
               nomeChefe, dataNascimentoChefe, departamento,
               nomeVendedor, dataNascimentoVendedor,
               nomeOperario, dataNascimentoOperario,
               nomeHorista, dataNascimentoHorista;
        int qtdVendas, qtdProduzida, totalHoras;
        float salarioChefe, salarioVendedor, salarioOperario, salarioHorista,
              comissao, valorProducao, valorHora;
        
        nomeEmpresa = input.next();
        cidadeEmpresa = input.next();
        mesPagamento = input.next();
        
        nomeChefe = input.next();
        dataNascimentoChefe = input.next();
        salarioChefe = input.nextFloat();
        departamento = input.next();
        
        nomeVendedor = input.next();
        dataNascimentoVendedor = input.next();
        salarioVendedor = input.nextFloat();
        comissao = input.nextFloat();
        qtdVendas = input.nextInt();

        nomeOperario = input.next();
        dataNascimentoOperario = input.next();
        salarioOperario = input.nextFloat();
        valorProducao = input.nextFloat();
        qtdProduzida = input.nextInt();
      
        nomeHorista = input.next();
        dataNascimentoHorista = input.next();
        salarioHorista = input.nextFloat();
        valorHora = input.nextFloat();
        totalHoras = input.nextInt();
        
        Chefe chefe = new Chefe(nomeChefe, dataNascimentoChefe, salarioChefe, departamento);
        Vendedor vendedor = new Vendedor(nomeVendedor, dataNascimentoVendedor, salarioVendedor,
                                        comissao, qtdVendas);
        Operario operario = new Operario(nomeOperario, dataNascimentoOperario, salarioOperario,
                                        valorProducao, qtdProduzida);
        Horista horista = new Horista(nomeHorista, dataNascimentoHorista, salarioHorista,
                                     valorHora, totalHoras);
        
        Funcionario[] funcionarios = {chefe, vendedor, operario, horista};

        FolhaPagamento folha = new FolhaPagamento();
        folha.mostrarPagamentos(nomeEmpresa, cidadeEmpresa, mesPagamento, funcionarios);
    }
    
}