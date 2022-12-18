/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author leorb
 */
public class Chamado {
    private int id;
    private String data, tipo, origem, destino;
    private String horarioPartida, horarioRetorno;
    private double kmInicial, kmFinal, valorTotal;
    private Veiculo veiculo;
    private Cliente cliente;
    private Motorista motorista;

    public Chamado(){

    }

    public Chamado(int id, String data, String tipo, String origem, String destino, 
    String horarioPartida, String horarioRetorno, double kmInicial, double kmFinal, double valorTotal) {
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
    }

    public Chamado(int id, String data, String tipo, String origem, String destino, 
    String horarioPartida, String horarioRetorno, double kmInicial, double kmFinal, 
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

    public String getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(String horarioRetorno) {
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
	str += "Id do chamado: " + id + "\n" + "Destino: " + destino + "\n" + "Placa do veículo: "
        + veiculo.getPlaca() + "\n" + "RG do cliente: " + cliente.getRg() + "\n" + "Nome do motorista: " + motorista.getNome();
	return str;
    }
}
