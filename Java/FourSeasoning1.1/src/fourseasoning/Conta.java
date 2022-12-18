package fourseasoning;

import java.util.ArrayList;

/**
 * Representa uma conta
 * @author leo_r
 */
public class Conta extends Pessoa{
    private int idConta;
    private String senha;
    private double saldo;
    private String categoria;
    private double fatura;
    private boolean pago;
    /**
     * Representa a mesa que essa conta usa
     */
    private Mesa mesa;
    /**
     * Representa os pedidos que a conta pode realizar
     */
    private ArrayList<Pedido> pedidos;
    
    public Conta(){    
    }
    /**
     * Constroe o objeto conta passando alguns atributos pertinentes
     * @param idConta
     * @param nome
     * @param cpf
     * @param telefone
     * @param email
     * @param genero
     * @param senha
     * @param saldo
     * @param categoria 
     */
    public Conta(int idConta, String nome, String cpf, String telefone, String email,
                 char genero, String senha, double saldo, String categoria) {
        super(nome, cpf, telefone, email, genero);
        this.idConta = idConta;
        this.senha = senha;
        this.saldo = saldo;
        this.categoria = categoria;
    }    
    /**
     * Constroe o objeto passando todos atributos que estao no banco de dados, exceto a mesa
     * @param idConta
     * @param nome
     * @param cpf
     * @param telefone
     * @param email
     * @param genero
     * @param senha
     * @param saldo
     * @param categoria
     * @param fatura
     * @param pago 
     */
    public Conta(int idConta, String nome, String cpf, String telefone, String email,
                 char genero, String senha, double saldo, String categoria, double fatura, boolean pago) {
        super(nome, cpf, telefone, email, genero);
        this.idConta = idConta;
        this.senha = senha;
        this.saldo = saldo;
        this.categoria = categoria;
        this.fatura = fatura;
        this.pago = pago;
    }
    /**
     * Verifica se a senha passada corresponde a senha da conta
     * @param senha
     * @return 
     */
    public boolean isSenha(String senha){
        return (senha == null ? this.senha == null : senha.equals(this.senha));
    }
    /**
     * Esse método verifica se o saldo eh maior que a fatura e se for subtrai o valor da fatura do saldo,
     * define o valor da fatura igual 0, torna a mesa que a conta estava usando disponivel novamente e
     * retorna true
     * @return 
     */
    public boolean pagar(){
        if(this.saldo >= this.fatura){
            this.saldo -= this.fatura;
            this.fatura = 0;
            this.mesa.setDisponibilidade(true);
            this.pago = true;
            this.mesa = new Mesa((byte) 0);
            return true;
        }else{
            return false;
        }
    }
    /**
     * Esse metodo recebe um valor e o adiciona ao saldo
     * @param valor 
     */
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return (this.getCpf() == null ? "Conta não existente" : "Cliente: " + this.getNome() + 
                "\nCPF: " + this.getCpf() + "\nTelefone: " + this.getTelefone() + 
                "\nEmail: " + this.getEmail() + "\nCategoria: " + this.categoria + 
                "\nSaldo: RS" + String.format("%.2f", this.saldo));
    }
    
    
}
