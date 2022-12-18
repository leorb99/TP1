import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Aula4 {
    public static void main(String[] args) {
        // String str1 = new String(); // criacao de um obj do tipo String
        // String str2 = new String("PROGRAMA"); // criacao de um obj do tipo String ja atribuindo valor
        // char[]caracteres = {'c','o','m','p','u','t','a','d','o','r'};
        // String str3 = new String(caracteres); //computador
        // System.out.println("str2: "+str2);
        // System.out.println("str3: "+str3);
        // String str4 = new String(caracteres,7,3); //dor
        // System.out.println("str4: "+str4);

        // StringBuffer sBff1 = new StringBuffer(); //capacidade=16
        // // StringBuffer sBff2 = new StringBuffer(10);//capacidade=10
        // StringBuffer sBff3 = new StringBuffer("valor");//capac=21
        // System.out.println("sBff3: "+sBff3);
        
        // // String str5 = "Programa"; //atribuição direta a literais
        // String str6 = new String();
        // str6 = "aula";
        // String str7 = new String();
        // String str8 = new String("Computador");
        // str7 = str8;
        // System.out.println("str7: "+str7);
        // System.out.println("str8: "+str8);
        // Character charac1 = 'a'; // criacao de um obj do tipo char

        // Scanner entrada = new Scanner(System.in);
        // String str9 = new String();
        // str9 = entrada.nextLine();
        // String str10 = new String();
        // StringBuffer sBff4 = new StringBuffer();
        // str2 = entrada.next();
        // sBff4.append(str10);
        // char char1 = entrada.next().charAt(0);


            int count = 0;
            Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
            // Matcher matcher = pattern.matcher("Visit W3Schools!");
            String phrase = "W3Schools";
            Matcher matcher = pattern.matcher("Visit W3Schools!");
            boolean matchFound = matcher.find();
            for (int i = 0; i < phrase.length(); i++) {
                if(matchFound) {
                    count++;
                } 
            }
            System.out.println(count);
        
    }
}
