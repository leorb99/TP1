import java.util.*;

public class CorretorOrtografico {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        boolean contains = false;
        boolean correct = false;
        List<String> wordsList = new ArrayList<String>();
        n = input.nextInt();

        for(int i = 0; i < n; i++){
            String palavra = input.next();
            wordsList.add(palavra);
        }
        String userInput = input.next();

        if(wordsList.contains(userInput)){
            correct = true;
        }
        if(correct) {
            System.out.println("palavra correta");
        }
     
        else if(!correct){
            for(int i = 0; i < wordsList.size(); i++){
                int diff = 0;
                if(wordsList.get(i).length() == userInput.length()){
                    for(int j = 0; j < wordsList.get(i).length(); j++){
                        if((wordsList.get(i).charAt(j) != userInput.charAt(j)) && 
                        (j+1 < wordsList.get(i).length())){
                            if(wordsList.get(i).charAt(j+1) != userInput.charAt(j)){
                                diff++;        
                            }
                        }
                    }
                    if(diff > 1){
                        continue;
                    } else{
                        System.out.println("palavra incorreta");
                        System.out.println(wordsList.get(i) + "?");
                        contains = true;
                        break;
                    }
                }
            }

        } 

        if(!correct && !contains){
            System.out.println("palavra incorreta");
            System.out.println("nenhuma sugestão");
        }
        
        input.close();
    }
}