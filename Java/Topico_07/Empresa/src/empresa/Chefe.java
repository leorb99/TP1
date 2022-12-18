package empresa;

public class Chefe extends Funcionario{
    private String departamento;

    public Chefe() {
        
    }

    public Chefe(String nome, String dataNascimento, float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
