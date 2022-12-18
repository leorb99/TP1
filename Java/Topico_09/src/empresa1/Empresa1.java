package empresa1;


import java.util.Locale;
import java.util.Scanner;

interface Classificavel {
    boolean menorElemento(Classificavel obj);
}


class Cliente implements Classificavel{
    private String cpf, nome, endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public boolean menorElemento(Classificavel obj){
        Cliente compara = (Cliente) obj;
        return this.nome.compareTo(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return cpf + " " + nome + " " + endereco;
    }
    
}


class Produto implements Classificavel{
    private int cod;
    private String nome;
    private double preco;

    public Produto(int cod, String nome, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }
    
    public boolean menorElemento(Classificavel obj){
        Produto compara = (Produto) obj;
        return this.cod < compara.cod;
    }

    @Override
    public String toString() {
        return cod + " " + nome + " " + preco;
    }
    
}


class Servico implements Classificavel{
    private String data, tipoServico;
    private double preco;

    public Servico(String data, String tipoServico, double preco) {
        this.data = data;
        this.tipoServico = tipoServico;
        this.preco = preco;
    }
    
    public boolean menorElemento(Classificavel obj){
        Servico compara = (Servico) obj;
        return this.preco < compara.preco;
    }
    
    @Override
    public String toString(){
        return tipoServico + " " + preco + " " + data;
    }
}


class Classificador {
    public void ordena(Classificavel a[]){
        Classificavel elem, menor;
        int pos;
        
        for(int i = 0; i < a.length - 1; i++){
            elem = a[i];
            menor = a[i + 1];
            pos = i + 1;
            for(int j = i + 2; j < a.length; j++){
                if(a[j].menorElemento(menor)){
                    menor = a[j];
                    pos = j;
                }
            }
            if(menor.menorElemento(elem)){
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
        for(Classificavel obj: a){
            System.out.println(obj);
        }
    }
}


public class Empresa1 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        
        Scanner input = new Scanner(System.in);
        int numProduto = input.nextInt();
        int numCliente = input.nextInt();
        int numServico = input.nextInt();
        Produto[] produtos = new Produto[numProduto];
        Cliente[] clientes = new Cliente[numCliente];
        Servico[] servicos = new Servico[numServico];
        
        for(int i = 0; i < numProduto; i++){
            int cod = input.nextInt();
            String nome = input.next();
            double preco = input.nextDouble();
            Produto prod = new Produto(cod, nome, preco);
            produtos[i] = prod;
        }
        
        for(int i = 0; i < numCliente; i++){
            String cpf = input.next();
            String nome = input.next();
            String endereco = input.next();
            Cliente cliente = new Cliente(cpf, nome, endereco);
            clientes[i] = cliente;
        }
        
        for(int i = 0; i < numServico; i++){
            String tipo = input.next();
            double preco = input.nextDouble();
            String data = input.next();
            Servico servico = new Servico(data, tipo, preco);
            servicos[i] = servico;
        }
        
        Classificador classifica = new Classificador();
        classifica.ordena(produtos);
        classifica.ordena(clientes);
        classifica.ordena(servicos);
    }
    
}
