package usocontatos;

public class Familia extends Contato{
    protected String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }
    
    public String imprimirContato(){
        String contato = super.imprimirBasico();
        contato += "Parentesco: " + parentesco;
        return contato;
    }
}
