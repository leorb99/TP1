package fourseasoning;

import org.json.simple.parser.JSONParser;

public interface BancoDeDados {
    
    JSONParser JSONPARSER = new JSONParser();
    String BANCODADOS = "BancoDeDados.json";
    
    void carregarBD();
    void addConta(Conta conta);
    void addPrato(Prato prato);
    void addMesa(Mesa mesa);
    void addFuncionario(Funcionario func);
    void rmFuncionario(Funcionario func);
    void rmMesa(Mesa mesa);
    void rmPrato(Prato prato);
    void rmConta(Conta conta);
    Conta pesquisarConta(String cpf);
    Funcionario pesquisarFuncionario(String cpf);
    Mesa pesquisarMesa(byte num);
    Prato pesquisarCardapio(String nome);
}
