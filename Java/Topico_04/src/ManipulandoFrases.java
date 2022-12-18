import java.util.*;

class Frase {
    private String frase;
  
    public Frase(String frase) {
        this.frase = frase;
    }
  
    public int contarVogais() {
        int totalVogais = 0;
        String vogais = "aAáÁàÀãÃâÂeEéÉêÊiIíÍoOóÓõÕôÔuUúÚ";
        for(int i = 0; i < frase.length(); i++) {
            for(int j = 0; j < vogais.length(); j++) {
                if(frase.charAt(i) == vogais.charAt(j)) {
                    totalVogais++;
                }
            }
        }
        return totalVogais;
    }
  
    public int contarPalavras() {
        int totalPalavras = 1;
  
        for(int i = 0; i < (frase.length()); i++) {
            if(frase.charAt(i) == ' ') {
                totalPalavras++;
        }
      }
      
        return totalPalavras;
    }
  
    public String getFrase() {
        return frase;
    }
  
    public void setFrase(String frase) {
        this.frase = frase;
    }
}

public class ManipulandoFrases {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in, "UTF-8");
  
    Frase frase1 = new Frase(input.nextLine());
    Frase frase2 = new Frase(input.nextLine());
  
    System.out.println(frase1.contarPalavras());
    System.out.println(frase2.contarVogais());
    input.close();
    }
}