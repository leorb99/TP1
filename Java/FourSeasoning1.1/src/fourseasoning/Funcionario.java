package fourseasoning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 * Representa um funcionario
 * @author leo_r
 */
public class Funcionario extends Pessoa implements BancoDeDados{
    private String cargo, senha;
    private double salario;
    private LocalDateTime pontoChegada;
    private LocalDateTime pontoSaida;
    private int cargaHoraria, bancoHoras;
    static private Funcionario gerente;
    static private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static private ArrayList<Conta> contas = new ArrayList<>();
    static private ArrayList<Mesa> mesas = new ArrayList<>();
    static private ArrayList<Prato> pratos = new ArrayList<>();
    
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String telefone, String email, char genero) {
        super(nome, cpf, telefone, email, genero);
    }

    public Funcionario(String nome, String cpf, String telefone, String email, char genero, 
            String cargo, String senha, double salario, int bancoHoras, int cargaHoraria, LocalDateTime ponto) {
        super(nome, cpf, telefone, email, genero);
        this.cargo = cargo;
        this.senha = senha;
        this.salario = salario;
        this.bancoHoras = bancoHoras;
        this.cargaHoraria = cargaHoraria;
        this.pontoChegada = ponto;
    }

    public Funcionario(String nome, String cpf, String telefone, String email, char genero, 
            String cargo, String senha, double salario, LocalDateTime pontoChegada, 
            int bancoHoras, int cargaHoraria) {
        super(nome, cpf, telefone, email, genero);
        this.cargo = cargo;
        this.senha = senha;
        this.salario = salario;
        this.pontoChegada = pontoChegada;
        this.bancoHoras = bancoHoras;
        this.cargaHoraria = cargaHoraria;
    }
    /**
     * Calcula o banco de horas do funcionario por uma simples diferenca entre a 
     * hora de entrada e a hora de saida
     */
    public void calcularBancoDeHoras(){
        Duration duracao = Duration.between(this.pontoChegada, this.pontoSaida);
        int expediente = (int) duracao.toHours();
        this.bancoHoras += expediente;
        this.pontoChegada = LocalDateTime.now();
    }
    /**
     * Verifica se a senha passada corresponde a senha do funcionario
     * @param senha
     * @return 
     */
    public boolean isSenha(String senha){
        return (senha == null ? this.senha == null : senha.equals(this.senha));
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDateTime getPontoChegada() {
        return pontoChegada;
    }

    public void setPontoChegada(LocalDateTime ponto) {
        this.pontoChegada = ponto;
    }

    public LocalDateTime getPontoSaida() {
        return pontoSaida;
    }

    public void setPontoSaida(LocalDateTime ponto) {
        this.pontoSaida = ponto;
    }

    public int getBancoHoras() {
        return bancoHoras;
    }

    public void setBancoHoras(int bancoHoras) {
        this.bancoHoras = bancoHoras;
    }

    public static Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        Funcionario.gerente = gerente;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        Funcionario.funcionarios = funcionarios;
    }

    public static ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        Funcionario.contas = contas;
    }

    public static ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        Funcionario.mesas = mesas;
    }

    public static ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        Funcionario.pratos = pratos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   

    public void marcarPonto(){
        atualizarBD();
    }
    
    @Override
    public String toString() {
        return (this.getCpf() == null ? "Funcionário não existente" : "Funcionário: " + 
                this.getNome() + "\nCPF: " + this.getCpf() + "\nEmail: " + 
                this.getEmail() + "\nCargo: " + this.cargo + 
                "\nSalário: R$" + String.format("%.2f", this.salario)) + 
                "\nBanco de horas: " + this.bancoHoras;
    }
    /**
     * Esse metodo eh responsavel por carregar os dados do arquivo BancoDeDados.json em 
     * ArrayLists correspondentes
     */
    @Override
    public void carregarBD() {
        try(FileReader reader = new FileReader(BANCODADOS)){
            Locale.setDefault(new Locale("en", "US"));
            Object obj = JSONPARSER.parse(reader);
            JSONObject BD = (JSONObject) obj;
            
            JSONArray BDContas = (JSONArray) BD.get("contas");
            JSONArray BDFuncionarios = (JSONArray) BD.get("funcionarios");
            JSONArray BDMesas = (JSONArray) BD.get("mesas");
            JSONObject BDCardapios = (JSONObject) BD.get("cardapios");
            JSONArray cVerao = (JSONArray) BDCardapios.get("verao");
            JSONArray cOutono = (JSONArray) BDCardapios.get("outono");
            JSONArray cInverno = (JSONArray) BDCardapios.get("inverno");
            JSONArray cPrimavera = (JSONArray) BDCardapios.get("primavera");
            
            /**
             * Constroe o objeto do tipo Mesa e insere no ArrayList correspondente
             * Esse eh o primeiro Array a ser carregado, porque os objetos Conta,
             * precisam desse Array para ser construido no loop seguinte
             */
            for(Object m: BDMesas) {
                JSONObject bMesa = (JSONObject) m;
                long mNumMesa = (long) bMesa.get("numMesa");
                long mQtdCadeiras = (long) bMesa.get("qtdCadeiras");
                boolean mDisponibilidade = (boolean) bMesa.get("disponibilidade");
                long mEstimativaEspera = (long) bMesa.get("estimativaEspera");
                String mArea = (String) bMesa.get("area");
                Mesa BDMesa;
                BDMesa = new Mesa((byte) mNumMesa, (byte) mQtdCadeiras, mDisponibilidade,
                                  (int) mEstimativaEspera, mArea);
                mesas.add(BDMesa);
            }
            /**
             * Constroe o ArrayList de Contas passando os objetos construidos
             */
            for(Object c: BDContas){
                JSONObject conta = (JSONObject) c;
                double cSaldo;
                double cFatura;
                
                long cIdConta = (long) conta.get("idConta");
                String cNome = (String) conta.get("nome");
                String cCpf = (String) conta.get("cpf");
                String cTelefone = (String) conta.get("telefone");
                String cEmail = (String) conta.get("email");
                char cGenero = ((String) conta.get("genero")).charAt(0);
                String cContaSenha = (String) conta.get("senha");
                String cCategoria = (String) conta.get("categoria");
                boolean cPago = (boolean) conta.get("pago");
                long mesaNum = (long) conta.get("mesa");
                
                if(conta.get("saldo") instanceof Long){
                    long saldo = (long) conta.get("saldo");
                    cSaldo = saldo / 1.0;
                }else{
                    cSaldo = (double) conta.get("saldo");
                }
                
                if(conta.get("fatura") instanceof Long){
                    long fatura = (long) conta.get("fatura");
                    cFatura = fatura / 1.0;
                }else{
                    cFatura = (double) conta.get("fatura");
                }
                
                Conta BDConta;
                BDConta = new Conta((int) cIdConta, cNome, cCpf, cTelefone, cEmail, 
                                    cGenero, cContaSenha, cSaldo, cCategoria, cFatura, cPago);
                
                // Essa verificacao eh necessaria para nao dar erro na hora de fazer o pedido
                if(mesaNum == 0){
                    BDConta.setMesa(new Mesa((byte) 0));
                }else{
                    BDConta.setMesa(pesquisarMesa((byte) mesaNum));
                }
                
                contas.add(BDConta);
            }
            /**
             * Constroe o ArrayList de Funcionarios 
             */
            for(Object f: BDFuncionarios){
                JSONObject func = (JSONObject) f;
                double fSalario;
                String fNome = (String) func.get("nome");
                String fCpf = (String) func.get("cpf");
                String fTelefone = (String) func.get("telefone");
                String fEmail = (String) func.get("email");
                char fGenero = ((String) func.get("genero")).charAt(0);
                String fSenha = (String) func.get("senha");
                long fBancoHoras = (long) func.get("bancoHoras");
                long fCarga = (long) func.get("cargaHoraria");
                String fCargo = (String) func.get("cargo");
                String fPonto = (String) func.get("ponto");
                LocalDateTime ponto = LocalDateTime.parse(fPonto);
                
                if(func.get("salario") instanceof Long){
                    long sal = (long) func.get("salario");
                    fSalario = sal / 1.0;
                }else{
                    fSalario = (double) func.get("salario");
                }
                
                Funcionario BDFuncionario;
                BDFuncionario = new Funcionario(fNome, fCpf, fTelefone, fEmail, 
                                                fGenero, fCargo, fSenha, fSalario,
                                                (int) fCarga, (int)fBancoHoras, ponto);
                if(BDFuncionario.cargo.equals("gerente")){
                    gerente = BDFuncionario;
                    this.setGerente(gerente);
                }
                funcionarios.add(BDFuncionario);
            }
            
            /**
             * Cada estacao esta sendo representada como  um JSONObject, entao
             * precisamos contruir e inserir os objetos Prato separadamente com 4 loops
             */
            for(Object prato: cVerao){
                JSONObject p = (JSONObject) prato;
                double vPreco;
                long vNumPrato = (long) p.get("numPrato");
                String vNome = (String) p.get("nome");
                String vDescricao = (String) p.get("descricao");
                long vTempoPreparo = (long) p.get("tempoPreparo");
                
                if(p.get("preco") instanceof Long){
                    long preco = (long) p.get("preco");
                    vPreco = preco / 1.0;
                }else{
                    vPreco = (double) p.get("preco");
                }
                
                Prato BDVerao;
                BDVerao = new Prato((byte) vNumPrato, vNome, vDescricao, vPreco,
                                       (int) vTempoPreparo, "verao");
                
                pratos.add(BDVerao);
            }
            
            for(Object prato: cOutono){
                JSONObject p = (JSONObject) prato;
                double oPreco;
                long oNumPrato = (long) p.get("numPrato");
                String oNome = (String) p.get("nome");
                String oDescricao = (String) p.get("descricao");
                long oTempoPreparo = (long) p.get("tempoPreparo");
                
                if(p.get("preco") instanceof Long){
                    long preco = (long) p.get("preco");
                    oPreco = preco / 1.0;
                }else{
                    oPreco = (double) p.get("preco");
                }
                
                Prato BDOutono;
                BDOutono = new Prato((byte) oNumPrato, oNome, oDescricao, oPreco,
                                       (int) oTempoPreparo, "outono");
                
                pratos.add(BDOutono);
            }
            
            for(Object prato: cInverno){
                JSONObject p = (JSONObject) prato;
                double iPreco; 
                long iNumPrato = (long) p.get("numPrato");
                String iNome = (String) p.get("nome");
                String iDescricao = (String) p.get("descricao");
                long iTempoPreparo = (long) p.get("tempoPreparo");
                
                if(p.get("preco") instanceof Long){
                    long preco = (long) p.get("preco");
                    iPreco = preco / 1.0;
                }else{
                    iPreco = (double) p.get("preco");
                }
                
                Prato BDInverno;
                BDInverno = new Prato((byte) iNumPrato, iNome, iDescricao, iPreco,
                                       (int) iTempoPreparo, "inverno");
                
                pratos.add(BDInverno);
            }
            
            for(Object prato: cPrimavera){
                JSONObject p = (JSONObject) prato;
                double pPreco;
                long pNumPrato = (long) p.get("numPrato");
                String pNome = (String) p.get("nome");
                String pDescricao = (String) p.get("descricao");
                long pTempoPreparo = (long) p.get("tempoPreparo");
                
                if(p.get("preco") instanceof Long){
                    long preco = (long) p.get("preco");
                    pPreco = preco / 1.0;
                }else{
                    pPreco = (double) p.get("preco");
                }
                
                Prato BDPrimavera;
                BDPrimavera = new Prato((byte) pNumPrato, pNome, pDescricao, pPreco,
                                       (int) pTempoPreparo, "primavera");
                
                pratos.add(BDPrimavera);
                
            }
        /**
         * Um problema que tivemos durante o desenvolvimento fez com que criassemos esse catch
         * Entao o programa so funciona se o arquivo de banco de dados estiver na mesma pasta
         * que o executavel
         */    
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Certifique-se que o arquivo BancoDeDados.json "
                                          + "está na mesma pasta que o executável", "Aviso",
                                          JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Adiciona o objeto conta ao ArrayList de contas e atualiza o banco de dados
     * @param conta 
     */
    @Override
    public void addConta(Conta conta) {
        contas.add(conta);
        atualizarBD();
    }
    /**
     * Adiciona o objeto prato ao ArrayList de pratos e atualiza o banco de dados
     * @param prato 
     */
    @Override
    public void addPrato(Prato prato) {
        pratos.add(prato);
        atualizarBD();
    }
    /**
     * Adiciona o objeto mesa ao ArrayList de mesas e atualiza o banco de dados
     * @param mesa 
     */
    @Override
    public void addMesa(Mesa mesa) {
        mesas.add(mesa);
        atualizarBD();
    }
    /**
     * Adiciona o objeto func ao ArrayList de funcionarios e atualiza o banco de dados
     * @param func 
     */
    @Override
    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
        atualizarBD();
    }
    /**
     * Remove o objeto func do ArrayList de funcionarios e atualiza o banco de dados
     * @param func 
     */
    @Override
    public void rmFuncionario(Funcionario func) {
        funcionarios.remove(pesquisarFuncionario(func.getCpf()));
        atualizarBD();
    }
    /**
     * Remove o objeto mesa do ArrayList de mesas e atualiza o banco de dados
     * @param mesa 
     */
    @Override
    public void rmMesa(Mesa mesa) {
        mesas.remove(pesquisarMesa(mesa.getNum()));
        atualizarBD();
    }
    /**
     * Remove o objeto prato do ArrayList de pratos e atualiza o banco de dados
     * @param prato 
     */
    @Override
    public void rmPrato(Prato prato) {
        pratos.remove(pesquisarCardapio(prato.getNomePrato()));
        atualizarBD();
    }
    /**
     * Remove o objeto conta do ArrayList de contas e atualiza o banco de dados
     * @param conta 
     */
    @Override
    public void rmConta(Conta conta) {
        contas.remove(pesquisarConta(conta.getCpf()));
        atualizarBD();
    }
    /**
     * A partir do cpf faz uma pesquisa no ArrayList de contas e retorna true se 
     * o cpf for igual ao atributo cpf de alguma conta
     * @param cpf
     * @return 
     */
    @Override
    public Conta pesquisarConta(String cpf) {
        for(Conta c: contas){
            if(cpf.equals(c.getCpf())){
                return c;
            }
        }return null;
        
    }
    /**
     * A partir do cpf faz uma pesquisa no ArrayList de funcionarios e retorna true se 
     * o cpf for igual ao atributo cpf de algum funcionario
     * @param cpf
     * @return 
     */
    @Override
    public Funcionario pesquisarFuncionario(String cpf) {
        for(Funcionario f: funcionarios){
            if(cpf.equals(f.getCpf())){
                return f;
            }        
        }return null;
    }
    /**
     * A partir do num pesquisa no ArrayList de mesas e retorna true se o num for igual
     * ao atributo num de alguma mesa
     * @param num
     * @return 
     */
    @Override
    public Mesa pesquisarMesa(byte num) {
        for(Mesa m: mesas){
            if(num == m.getNum()){
                return m;
            }
        }return null;

    }
    /**
     * A partir do nome pesquisa no ArrayList de pratos e retorna true se o nome
     * for igual ao atributo nomePrato de algum prato
     * @param nome
     * @return 
     */
    @Override
    public Prato pesquisarCardapio(String nome) {
        for(Prato p: pratos){
            if(nome.toLowerCase().equals(p.getNomePrato().toLowerCase())){
                return p;
            }
        }return null;
       
    }
    /**
     * Esse metodo eh responsavel por atualizar o arquivo BancoDeDados.json
     * Aqui sera construido JSONArrays e JSONObjects para serem reescritos no arquivo
     */
    private void atualizarBD() {
        JSONObject BD = new JSONObject();
        JSONObject BDCardapios = new JSONObject();
        JSONArray BDContas = new JSONArray();
        JSONArray BDFuncionarios = new JSONArray();
        JSONArray BDMesas = new JSONArray();
        JSONArray BDVerao = new JSONArray();
        JSONArray BDOutono = new JSONArray();
        JSONArray BDInverno = new JSONArray();
        JSONArray BDPrimavera = new JSONArray();
        
        for(Conta c: contas){
            JSONObject aConta = new JSONObject();
            aConta.put("idConta", (long) c.getIdConta());
            aConta.put("nome", c.getNome());
            aConta.put("cpf", c.getCpf());
            aConta.put("telefone", c.getTelefone());
            aConta.put("email", c.getEmail());
            aConta.put("genero", String.valueOf(c.getGenero()));
            aConta.put("senha", c.getSenha());
            aConta.put("saldo", (double) c.getSaldo());
            aConta.put("categoria", c.getCategoria());
            aConta.put("fatura", (double) c.getFatura());
            aConta.put("pago", c.isPago());
            aConta.put("mesa", c.getMesa() == null ? 0 : c.getMesa().getNum());
            BDContas.add(aConta);
        }
        
        for(Funcionario f: funcionarios){
            JSONObject aFuncionario = new JSONObject();
            aFuncionario.put("nome", f.getNome());
            aFuncionario.put("cpf", f.getCpf());
            aFuncionario.put("telefone", f.getTelefone());
            aFuncionario.put("email", f.getEmail());
            aFuncionario.put("genero", String.valueOf(f.getGenero()));
            aFuncionario.put("senha", f.getSenha());
            aFuncionario.put("salario", (double) f.getSalario());
            aFuncionario.put("bancoHoras", (long) f.getBancoHoras());
            aFuncionario.put("cargaHoraria", (long) f.getCargaHoraria());
            aFuncionario.put("cargo", f.getCargo());
            aFuncionario.put("ponto", f.getPontoChegada().toString());
            BDFuncionarios.add(aFuncionario);            
        }
        
        for(Mesa m: mesas){
            JSONObject aMesa = new JSONObject();
            aMesa.put("numMesa", (long) m.getNum());
            aMesa.put("qtdCadeiras", (long) m.getQtdCadeiras());
            aMesa.put("disponibilidade", m.getDisponibilidade());
            aMesa.put("estimativaEspera", (long) m.getTempoEspera());
            aMesa.put("area", m.getArea());
            BDMesas.add(aMesa);
        }
        
        for(Prato p: pratos){
            if(p.getEstacao().equals("verao")){
                JSONObject aVerao = new JSONObject();
                aVerao.put("numPrato", (long) p.getNumPrato());
                aVerao.put("nome", p.getNomePrato());
                aVerao.put("descricao", p.getDescricao());
                aVerao.put("preco", (double) p.getPreco());
                aVerao.put("tempoPreparo", (long) p.getTempoPreparo());
                BDVerao.add(aVerao);
                
            }else if(p.getEstacao().equals("outono")){
                JSONObject aOutono = new JSONObject();                
                aOutono.put("numPrato", (long) p.getNumPrato());
                aOutono.put("nome", p.getNomePrato());
                aOutono.put("descricao", p.getDescricao());
                aOutono.put("preco", p.getPreco());
                aOutono.put("tempoPreparo", (long) p.getTempoPreparo());                
                BDOutono.add(aOutono);
                
            }else if(p.getEstacao().equals("inverno")){
                JSONObject aInverno = new JSONObject();                
                aInverno.put("numPrato", (long) p.getNumPrato());
                aInverno.put("nome", p.getNomePrato());
                aInverno.put("descricao", p.getDescricao());
                aInverno.put("preco", p.getPreco());
                aInverno.put("tempoPreparo", (long) p.getTempoPreparo());                
                BDInverno.add(aInverno);
                
            }else if(p.getEstacao().equals("primavera")){
                JSONObject aPrimavera = new JSONObject();                
                aPrimavera.put("numPrato", (long) p.getNumPrato());
                aPrimavera.put("nome", p.getNomePrato());
                aPrimavera.put("descricao", p.getDescricao());
                aPrimavera.put("preco", p.getPreco());
                aPrimavera.put("tempoPreparo", (long) p.getTempoPreparo());                
                BDPrimavera.add(aPrimavera);
            }
            BDCardapios.put("verao", BDVerao);
            BDCardapios.put("outono", BDOutono);
            BDCardapios.put("inverno", BDInverno);
            BDCardapios.put("primavera", BDPrimavera);
        }
        
        BD.put("contas", BDContas);
        BD.put("funcionarios", BDFuncionarios);
        BD.put("mesas", BDMesas);
        BD.put("cardapios", BDCardapios);
        
        try(FileWriter writer = new FileWriter(BANCODADOS)){
                writer.write(BD.toJSONString());
                writer.flush();
        }catch(Exception e){
                
        }
    }
 }
