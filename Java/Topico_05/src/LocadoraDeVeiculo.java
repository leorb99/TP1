import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Chamado{
    private int id;
    private String data, tipo, origem, destino;
    private float horarioPartida, horarioRetorno;
    private double kmInicial, kmFinal, valorTotal;
	private Veiculo veiculo;
	private Cliente cliente;
	private Motorista motorista;

	public Chamado(){

	}

	public Chamado(int id, String data, String tipo, String origem, String destino, 
	float horarioPartida, float horarioRetorno, double kmInicial, double kmFinal, 
	double valorTotal, Veiculo veiculo, Motorista motorista, Cliente cliente){
		this.id = id;
		this.data = data;
		this.tipo = tipo;
		this.origem = origem;
		this.destino = destino;
		this.horarioPartida = horarioPartida;
		this.horarioRetorno = horarioRetorno;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorTotal = valorTotal;
		this.veiculo = veiculo;
		this.motorista = motorista;
		this.cliente = cliente;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(float horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public float getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(float horarioRetorno) {
        this.horarioRetorno = horarioRetorno;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
    }

	public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
    }

	public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
    }

	public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
		this.cliente = cliente;
    }

	public String toString(){
		String str = "";
		str += id + "\n" + destino + "\n" + veiculo.getPlaca() + "\n" + cliente.getRg() + "\n" + motorista.getNome();
		return str;
	}
}


class Cliente{

	private int id;
	private String nome, rg, cpf, telefone;

	public Cliente(){

	}
	
	public Cliente(int id, String nome, String telefone, String rg, String cpf){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Motorista{

	private int id;
	private String nome, telefone, cnh;

	public Motorista(){
		
	}

	public Motorista(int id, String nome, String telefone, String cnh){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cnh = cnh;

	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
		this.cnh = cnh;
    }
}

class Veiculo{

	private int ano;
	private String placa, marca, modelo, cor;
    
	public Veiculo(){
		
	}

	public Veiculo(String placa, String marca, String modelo, String cor, int ano){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
public class LocadoraDeVeiculo{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> dadosVeiculo = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        List<String> dadosMotorista = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        List<String> dadosCliente = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        List<String> dadosChamado = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        
        Veiculo veiculo = new Veiculo(dadosVeiculo.get(0), dadosVeiculo.get(1), 
        dadosVeiculo.get(2), dadosVeiculo.get(3), Integer.parseInt(dadosVeiculo.get(4)));
        Motorista motorista = new Motorista(Integer.parseInt(dadosMotorista.get(0)), dadosMotorista.get(1),
        dadosMotorista.get(2), dadosMotorista.get(3));
        Cliente cliente = new Cliente(Integer.parseInt(dadosCliente.get(0)), dadosCliente.get(1),
        dadosCliente.get(2), dadosCliente.get(3), dadosCliente.get(4));
        Chamado chamado = new Chamado(Integer.parseInt(dadosChamado.get(0)), dadosChamado.get(1),
        dadosChamado.get(2), dadosChamado.get(3), dadosChamado.get(4),
        Float.parseFloat(dadosChamado.get(5)), Float.parseFloat(dadosChamado.get(6)),
        Double.parseDouble(dadosChamado.get(7)), Double.parseDouble(dadosChamado.get(8)),
        Double.parseDouble(dadosChamado.get(9)), veiculo, motorista, cliente);

        System.out.println(chamado);
        input.close(); 
    }
}

/*
input
BRA5E20 Chevrolet Onix branco 2014
11111 João 1111-1111 10101010
999999 Victor 5555-5555 22222222 333333333333 
10 02/08/2021 corrida AsaNorte AsaSul 13.30 13.50 85000 85010 10.00

output
10
AsaSul
BRA5E20
22222222
João
*/