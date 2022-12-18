import java.util.*;

public class SiglasDaInternet {
    public static void main(String[] args) {
        int num;
        String traducao = "";
        String giria = "";
        Scanner input = new Scanner(System.in, "UTF-8");
        num = input.nextInt();
        Map<String, String> dicionario = new HashMap<String, String>();

        for (int i = 0; i < num; i++) {
            String sigla = input.next();
            String palavra = input.next();
            dicionario.put(sigla, palavra);
        }
        input.nextLine();
        String frase = input.nextLine();
        List<String> listaPalavras = new ArrayList<String>(Arrays.asList(frase.split(" ")));

        for(int i = 0; i < listaPalavras.size(); i++) {
            for(String key : dicionario.keySet()) {
                if(key.equals(listaPalavras.get(i).toLowerCase())) {
                    int index = listaPalavras.indexOf(listaPalavras.get(i)); 
                    traducao =  dicionario.get(listaPalavras.get(index).toLowerCase());
                    giria = listaPalavras.get(index);
                }
                frase = frase.replace(giria, traducao);
            }
        }

        System.out.println(frase);
        input.close();
    }
}