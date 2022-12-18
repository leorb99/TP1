package usocontatos;

public abstract class Contato {
    protected String nome, apelido, email, aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        String basico = "";
        basico += "Nome: " + nome + "\n" + "Apelido: " + apelido + "\n" + "Email: " + email + "\n" + "Aniversário: " + aniversario + "\n";
        return basico;
    }
    
    public abstract String imprimirContato();
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
}
