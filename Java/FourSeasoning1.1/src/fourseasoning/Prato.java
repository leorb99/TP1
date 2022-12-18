package fourseasoning;
/**
 * Representa os pratos disponiveis no restaurante
 * @author leo_r
 */
public class Prato {
    private byte numPrato;
    private String nomePrato;
    private String descricao;
    private double preco;
    private int tempoPreparo;
    private String estacao;

    public Prato() {
        
    }
    /**
     * Constroe o objeto passando todos seus atributos
     * @param numPrato
     * @param nomePrato
     * @param descricao
     * @param preco
     * @param tempoPreparo
     * @param estacao 
     */
    public Prato(byte numPrato, String nomePrato, String descricao, double preco, int tempoPreparo, String estacao) {
        this.numPrato = numPrato;
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.estacao = estacao;
    }

    /**
     * Define a estacao do objeto com auxilio de um enum
     * @param e 
     */
    public void trocaEstacao(Estacao e){
        if(null != e)switch (e) {
            case INVERNO:
                this.estacao = "inverno";
            case OUTONO:
                this.estacao = "outono";
            case PRIMAVERA:
                this.estacao = "primavera";
            case VERAO:
                this.estacao = "verao";
            default:
                break;
        }
    }
   
    public byte getNumPrato() {
        return numPrato;
    }

    public void setNumPrato(byte numPrato) {
        this.numPrato = numPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return (this.nomePrato == null ? "Prato não existe" : "Prato de " + this.estacao +
                "\nNúmero: " + this.numPrato + "\nNome: " + this.nomePrato + 
                "\nDescricão: " + this.descricao + "\nPreço: " + this.preco + 
                "\nTempo de preparo: " + this.tempoPreparo);
    }
    
     
   
}
