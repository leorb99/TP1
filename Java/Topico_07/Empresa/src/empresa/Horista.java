package empresa;

public class Horista extends Funcionario{
    private float valorHora;
    private int totalHoras;

    public Horista() {
    
    }

    public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }
    
    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    } 
}
