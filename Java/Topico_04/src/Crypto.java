import java.util.Scanner;

class Criptografia {
    private String frase;
  
    public Criptografia(String frase) {
        this.frase = frase;
    }
  
    public String getFrase() {
        return frase;
    }
  
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String criptografarFrase() {
        String vogais = "aAáÁàÀãÃâÂeEéÉêÊiIíÍoOóÓõÕôÔuUúÚ";
        for(int i = 0; i < frase.length(); i++) {
            for(int j = 0; j < vogais.length(); j++) {
                if(frase.charAt(i) == vogais.charAt(j)) {
      	  	        frase = frase.replace(frase.charAt(i), '*');
                }
            }
        }
    	return frase;
	}
}

public class Crypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
        String frase1 = input.nextLine();
        String frase2 = input.nextLine();
        String frase3 = input.nextLine();
        Criptografia crypto = new Criptografia(frase1);
        crypto.setFrase(frase3);
        
        System.out.println(frase2);
        System.out.println(crypto.criptografarFrase());
    
        input.close();
    }
}