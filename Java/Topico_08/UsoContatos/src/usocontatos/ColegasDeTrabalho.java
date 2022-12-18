package usocontatos;

public class ColegasDeTrabalho extends Contato{
    protected String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }
    
    public String imprimirContato(){
        String contato = super.imprimirBasico();
        contato += "Relacionamento de trabalho: " + tipo;
        return contato;
    }
}
