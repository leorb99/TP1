package fourseasoning;

import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import static fourseasoning.Funcionario.getContas;
import java.util.ArrayList;
import java.util.Arrays;

public class Testes {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        JSONParser jsonParser = new JSONParser();
        Conta acc = new Conta(11, "Caze", "488888888656", "5646468468", "caze@gmail.com", 'm', "senha1234", 445.80, "premium",0,true);
        Prato prato1 = new Prato((byte)17,"hamburguer","burgao",15.90,20,"inverno");
        Prato prato2 = new Prato((byte)16,"Bife à cavalo","Bife com ovo",23.60,90,"outono");
        Mesa mesa = new Mesa((byte)20,(byte)8,true,40);
        Funcionario func = new Funcionario("Leo","645684648","564684684","leo@gmail.com",'m',"chef","ksldjgassdjk",4000,0,80,LocalDateTime.now());
        Funcionario f = new Funcionario();
        f.carregarBD();
        String str = "geekss for geekss";
        String[] arrOfStr = str.split(" ", 5);
        System.out.println(arrOfStr[0]);
    
        ArrayList<Conta> c = getContas();
        for(int i = 0; i < c.size(); i++){
            String[] primeiroNome = c.get(i).getNome().split(" ", 5);
            System.out.println(primeiroNome[0]);
        }
       // for(Conta cc: getContas()){
      //      System.out.println(cc.getCategoria());
      //  }
   //     System.out.println(f.getGerente().getCpf());
      //  Cardapio c = f.pesquisarCardapio("a");
    //    f.funcionarios.get(0).setNome("OUTRO");
     //   System.out.println(f.funcionarios.get(0));
         //System.out.println(f.getMesas().get(0).getArea());
         //f.addConta(acc);
         //System.out.println(f.pesquisarMesa((byte)0));

         
        //Funcionario ff = f.pesquisarFuncionario("1");
        //System.out.println(ff);
        /*System.out.println(f.getFuncionarios().get(0).getCargo());
        System.out.println(f.getContas().get(8).getNome());
        System.out.println(f.getMesas().get(0).getQtdCadeiras());
        System.out.println(f.getPratos().get(10).getEstacao());
        System.out.println(f.getPratos().get(20).getEstacao());
        System.out.println(f.getPratos().get(35).getEstacao());
        System.out.println(f.getPratos().get(46).getEstacao());
        System.out.println(f.getPratos().get(54).getNumPrato());
        
        System.out.println(f.pesquisarCardapio("Risoto de brócolis"));
        System.out.println(f.pesquisarFuncionario("645684648"));
        System.out.println(f.pesquisarConta("488888888656"));
        System.out.println(f.pesquisarConta("48888656"));
        System.out.println(f.pesquisarMesa((byte) 20));
        Conta c = new Conta();
        System.out.println(c);
        */
       // System.out.println(f.getGerente().getNome());
        //f.demitirFuncionario(func);
        /*for(Cardapio c: f.getPratos()){
        f.addConta(acc);
            System.out.println(c.getEstacao());
            System.out.println(c.getNumPrato());
            System.out.println(c.getNomePrato());
            System.out.println(c.getDescricao());
            System.out.println(c.getPreco());
            System.out.println(c.getTempoPreparo());
            System.out.println();
        }
        
        f.addPrato(prato1);
        f.contratarFuncionario(func);
        f.addMesa(mesa);
        */
        /*
        try(FileReader reader = new FileReader("BancoDeDados.json")){
            Object obj = jsonParser.parse(reader);
            JSONObject banco = (JSONObject) obj;
            
            JSONArray contas = (JSONArray) banco.get("contas");
            JSONArray funcionarios = (JSONArray) banco.get("funcionarios");
            JSONArray mesas = (JSONArray) banco.get("mesas");
            JSONObject cardapios = (JSONObject) banco.get("cardapios");
            JSONArray verao = (JSONArray) cardapios.get("verao");
            JSONArray outono = (JSONArray) cardapios.get("outono");
            JSONArray inverno = (JSONArray) cardapios.get("inverno");
            JSONArray primavera = (JSONArray) cardapios.get("primavera");
            
            JSONObject novoPrato = new JSONObject();
            JSONObject novoPrato2 = new JSONObject();
            novoPrato.put("numPrato", (long) prato1.getNumPrato());
            novoPrato.put("nome", prato1.getNomePrato());
            novoPrato.put("descricao", prato1.getDescricao());
            novoPrato.put("preco", prato1.getPreco());
            novoPrato.put("tempoPreparo", (long) prato1.getTempoPreparo());

            novoPrato2.put("numPrato", (long) prato2.getNumPrato());
            novoPrato2.put("nome", prato2.getNomePrato());
            novoPrato2.put("descricao", prato2.getDescricao());
            novoPrato2.put("preco", prato2.getPreco());
            novoPrato2.put("tempoPreparo", (long) prato2.getTempoPreparo());
            
            verao.add(novoPrato);
            outono.add(novoPrato2);
            // simulando o cadastro de uma nova conta
            // considerando que a conta ja foi instanciada
            // primeiro cria-se o JSONObject
            // usando o metodo put inseri os dados da conta utilizando os getters
            JSONObject novaConta = new JSONObject();
            novaConta.put("idConta", (long) acc.getIdConta());
            novaConta.put("nome", acc.getNome());
            novaConta.put("cpf", acc.getCpf());
            novaConta.put("teledone", acc.getTelefone());
            novaConta.put("email", acc.getEmail());
            novaConta.put("senha", acc.getSenha());
            novaConta.put("saldo", acc.getSaldo());
            novaConta.put("categoria", acc.getCategoria());
            // com o objeto json criado adicionei ele ao objeto correspondente do banco de dados
            contas.add(novaConta);
            // aqui o banco de dados sera reescrito, foi a forma mais facil que encontrei para atualiza-lo
            banco.put("contas", contas);
            banco.put("funcionarios", funcionarios);
            banco.put("mesas", mesas);
            banco.put("cardapios", cardapios);
            // por fim, escreve o banco de dados atualizado
            
            try(FileWriter writer = new FileWriter("BancoDeDados.json")){
                writer.write(banco.toJSONString());
                writer.flush();
            }catch(Exception e){
                
            }
            for(Object c: contas){
                JSONObject conta = (JSONObject) c;
                long idConta = (long) conta.get("idConta");
                String nome = (String) conta.get("nome");
                String cpf = (String) conta.get("cpf");
                String telefone = (String) conta.get("telefone");
                String email = (String) conta.get("email");
                String senha = (String) conta.get("senha");
                double saldo = (Double) conta.get("saldo");
                String categoria = (String) conta.get("categoria");
                
                System.out.println(idConta);
                System.out.println(nome);
                System.out.println(cpf);
                System.out.println(telefone);
                System.out.println(email);
                System.out.println(senha);
                System.out.println(saldo);
                System.out.println(categoria);
                System.out.println("---------------------\n");
            }
            
            for(Object funcionario: funcionarios){
                JSONObject func = (JSONObject) funcionario;
                String nome = (String) func.get("nome");
                String cpf = (String) func.get("cpf");
                String telefone = (String) func.get("telefone");
                String email = (String) func.get("email");
                String senha = (String) func.get("senha");
                double salario = (Double) func.get("salario");
                long bancoHoras = (long) func.get("bancoHoras");
                String cargo = (String) func.get("cargo");
                
                System.out.println(nome);
                System.out.println(cpf);
                System.out.println(telefone);
                System.out.println(email);
                System.out.println(senha);
                System.out.println(salario);
                System.out.println(bancoHoras);
                System.out.println(cargo);
                System.out.println("---------------------\n");
            }
            
            for(Object mesa: mesas) {
                JSONObject m = (JSONObject) mesa;
                long numMesa = (long) m.get("numMesa");
                long qtdCadeiras = (long) m.get("qtdCadeiras");
                boolean disponibilidade = (boolean) m.get("disponibilidade");
                long estimativaEspera = (long) m.get("estimativaEspera");
                
                System.out.println(numMesa);
                System.out.println(qtdCadeiras);
                System.out.println(disponibilidade);
                System.out.println(estimativaEspera);
                System.out.println("---------------------\n");               
            }
            
            for(Object prato: verao){
                JSONObject p = (JSONObject) prato;
                long numPrato = (long) p.get("numPrato");
                String nome = (String) p.get("nome");
                String descricao = (String) p.get("descricao");
                double preco = (Double) p.get("preco");
                long tempoPreparo = (long) p.get("tempoPreparo");
                
                System.out.println(numPrato);
                System.out.println(nome);
                System.out.println(descricao);
                System.out.println(preco);
                System.out.println(tempoPreparo);
                System.out.println("---------------------\n");                
            }
            
            for(Object prato: outono){
                JSONObject p = (JSONObject) prato;
                long numPrato = (long) p.get("numPrato");
                String nome = (String) p.get("nome");
                String descricao = (String) p.get("descricao");
                double preco = (Double) p.get("preco");
                long tempoPreparo = (long) p.get("tempoPreparo");
                
                System.out.println(numPrato);
                System.out.println(nome);
                System.out.println(descricao);
                System.out.println(preco);
                System.out.println(tempoPreparo);
                System.out.println("---------------------\n");                
            }
                        
            for(Object prato: inverno){
                JSONObject p = (JSONObject) prato;
                long numPrato = (long) p.get("numPrato");
                String nome = (String) p.get("nome");
                String descricao = (String) p.get("descricao");
                double preco = (Double) p.get("preco");
                long tempoPreparo = (long) p.get("tempoPreparo");
                
                System.out.println(numPrato);
                System.out.println(nome);
                System.out.println(descricao);
                System.out.println(preco);
                System.out.println(tempoPreparo);
                System.out.println("---------------------\n");                
            }
                        
                for(Object prato: primavera){
                JSONObject p = (JSONObject) prato;
                long numPrato = (long) p.get("numPrato");
                String nome = (String) p.get("nome");
                String descricao = (String) p.get("descricao");
                double preco = (Double) p.get("preco");
                long tempoPreparo = (long) p.get("tempoPreparo");
                
                System.out.println(numPrato);
                System.out.println(nome);
                System.out.println(descricao);
                System.out.println(preco);
                System.out.println(tempoPreparo);
                System.out.println("---------------------\n");                
            }

        }catch(Exception e){
            
        }*/
    }

}
