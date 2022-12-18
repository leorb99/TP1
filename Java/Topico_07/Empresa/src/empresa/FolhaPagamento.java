package empresa;

public class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario[] funcionarios){
        
        System.out.println("Nome da Empresa: " + nome + "\n" + "Endereço: " + cidade + "\n" + "Mês: " + mes);
        for(Funcionario funcionario: funcionarios){
            System.out.println("\n" + "Nome: " + funcionario.getNome());
            System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
            if(funcionario instanceof Chefe){
                Chefe chief = (Chefe) funcionario;
                System.out.println("Salário: R$" + chief.getSalario());
                System.out.println("Departamento: " + chief.getDepartamento());
                System.out.println("Cargo: chefe");
            }
            else if(funcionario instanceof Vendedor){
                Vendedor seller = (Vendedor) funcionario;
                System.out.println("Salário: R$" + (seller.getSalario() + seller.getComissaoVenda() * seller.getQtdVendas()));
                System.out.println("Cargo: vendedor");
                System.out.println("Comissão por Venda: R$" + seller.getComissaoVenda());
                System.out.println("Número de vendas: " + seller.getQtdVendas());
            }
            else if(funcionario instanceof Operario){
                Operario worker = (Operario) funcionario;
                System.out.println("Salário: R$" + worker.getValorProducao() * worker.getQtdProduzida());
                System.out.println("Cargo: Operário");
                System.out.println("Valor por Produção: R$" + worker.getValorProducao());
                System.out.println("Quantidade produzida: " + worker.getQtdProduzida());
            }
            else if(funcionario instanceof Horista){
                Horista hourly = (Horista) funcionario;
                System.out.println("Salário: R$" + hourly.getValorHora() * hourly.getTotalHoras());
                System.out.println("Cargo: horista");
                System.out.println("Valor por Hora: R$" + hourly.getValorHora());
                System.out.println("Total de horas: " + hourly.getTotalHoras());
            }
        }
    }
}
