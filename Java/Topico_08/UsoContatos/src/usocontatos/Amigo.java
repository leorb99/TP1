package usocontatos;

public class Amigo extends Contato{
    protected int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }
    
    public String imprimirContato(){
        String contato = super.imprimirBasico();
        
        switch (grau) {
            case 1 -> contato += "Grau: Melhor Amigo";
            case 2 -> contato += "Grau: Amigo";
            case 3 -> contato += "Grau: Conhecido";
            default -> {
            }
        }
        return contato;
    }
}
