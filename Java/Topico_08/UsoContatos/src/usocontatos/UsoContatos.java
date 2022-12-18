package usocontatos;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoContatos {

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int op = 0;
        while(op != 8){
            op = input.nextInt();
            String nome, apelido, email, aniversario, parentesco, tipo;
            int grau;
            switch(op){
                case 1:
                    int subtipo = input.nextInt();
                    
                    if(subtipo == 1){
                        nome = input.next();
                        apelido = input.next();
                        email = input.next();
                        aniversario = input.next();
                        grau = input.nextInt();
                        Amigo amigo = new Amigo(nome, apelido, email, aniversario, grau);
                        contatos.add(amigo);
                    }
                    else if(subtipo == 2){
                        nome = input.next();
                        apelido = input.next();
                        email = input.next();
                        aniversario = input.next();
                        parentesco = input.next();
                        Familia parente = new Familia(nome, apelido, email, aniversario, parentesco);
                        contatos.add(parente);
                    }
                    else if(subtipo == 3){
                        nome = input.next();
                        apelido = input.next();
                        email = input.next();
                        aniversario = input.next();
                        tipo = input.next();
                        ColegasDeTrabalho colega = new ColegasDeTrabalho(nome, apelido, email, aniversario, tipo);
                        contatos.add(colega);
                    }
                    break;
                    
                case 2:
                    for(Contato contato: contatos){
                        System.out.println(contato.imprimirContato());
                    }
                    break;
                
                case 3:
                    for(Contato contato: contatos){
                        if(contato instanceof Familia){
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;
                
                case 4:
                    for(Contato contato: contatos){
                        if(contato instanceof Amigo){
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;                    
                
                case 5:
                    for(Contato contato: contatos){
                        if(contato instanceof ColegasDeTrabalho){
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;
                
                case 6:
                    for(Contato contato: contatos){
                        if(contato instanceof Amigo){
                            Amigo amigo = (Amigo) contato;
                            if(amigo.grau == 1){
                                System.out.println(contato.imprimirContato());
                            }
                        }
                        else if(contato instanceof Familia){
                            Familia parente = (Familia) contato;
                            if(parente.parentesco.equals("irmão")){
                                System.out.println(contato.imprimirContato());
                            }
                        }
                        else if(contato instanceof ColegasDeTrabalho){
                            ColegasDeTrabalho colega = (ColegasDeTrabalho) contato;
                            if(colega.tipo.equals("colega")){
                                System.out.println(contato.imprimirContato());
                            }
                        }
                    }
                    break;                    
                
                case 7:
                    int indice = input.nextInt();
                    System.out.println(contatos.get(indice-1).imprimirContato());
                    break;
                
                                   
                default:
                    break;
            }
        }
    }
    
}
