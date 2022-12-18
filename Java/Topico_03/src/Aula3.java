/*
class Brinquedo {

    public int codigo;
    public String nome;
    public String descricao;
    public double preco;

    public void incluir() {
        System.out.println("Incluindo brinquedo");
    }

    public void exluir() {
        System.out.println("Excluindo brinquedo");
    }

    public void alterar() {
        System.out.println("Alterando brinquedo");
    }

    public void mostrar() {
        System.out.println("codigo: " + codigo + "\nnome: " + nome + 
        "\ndescricao: " + descricao + "\npreco: " + preco);
    }
}

public class Aula3 {
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo();
        brinquedo1.codigo = 501;
        brinquedo1.nome = "Boneca";
        brinquedo1.descricao = "Boneca de criança";
        brinquedo1.preco = 109.00;

        Brinquedo brinquedo2 = new Brinquedo();
        brinquedo2.codigo = 213;
        brinquedo2.nome = "Carrinho";
        brinquedo2.descricao = "Carrinho de criança";
        brinquedo2.preco = 79.00;

        System.out.println("Brinquedo 1: " + brinquedo1.nome);
        System.out.println("Brinquedo 2: " + brinquedo2.nome);

        brinquedo1.alterar();
        brinquedo1.exluir();
        brinquedo2.incluir();
        brinquedo2.mostrar();
    }
}

*/

/*
class Lampada {
    public boolean estadoDaLampada;

    public void acender() {
        estadoDaLampada = true;
    }

    public void apagar() {
        estadoDaLampada = false;
    }

    public void mostrarEstado() {
        if (estadoDaLampada == true){
            System.out.println("Lampada acesa");
        } else{
            System.out.println("Lampada apagada");
        }
    }
}


public class Aula3 {
    public static void main(String[] args){

        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        lampada1.estadoDaLampada = false;
        lampada2.estadoDaLampada = true;
        lampada1.acender();
        lampada2.apagar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
*/

/*
class Conta {
    
    public String nome;
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void mostrar() {
        System.out.println("Conta: " + nome + "\nSaldo: " + saldo);
    }
}

public class Aula3 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.nome = "João";
        conta1.saldo = 5500;
        conta2.nome = "Maria";
        conta2.saldo = 10000;

        System.out.println("Estado inicial das contas");
        conta1.mostrar();
        conta2.mostrar();

        System.out.println("Deposito de 1250.63 na conta do João");
        conta1.depositar(1250.63);
        conta1.mostrar();

        System.out.println("Deposito de 1500.86 na conta da Maria");
        conta2.depositar(1500.86);
        conta2.mostrar();
        
        System.out.println("Saque de 1860.28 na conta do João");
        conta1.sacar(1860.28);
        conta1.mostrar();

        System.out.println("Saque de 2862.41 na conta da Maria");
        conta2.sacar(2862.41);
        conta2.mostrar();
        
    }
}
*/

/*
class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public Conta(String nome) {
        this.nome = nome;
    }

    public String toString() {
        String conta = "";
        conta = conta + "Nome: " + nome + "\n";
        conta = conta + "Saldo: " + saldo + "\n";
        return conta;
    }
}


public class Aula3 {
    public static void main(String[] args) {
        Conta conta3 = new Conta();
        Conta conta4 = new Conta("José");
        Conta conta1 = new Conta("João", 5500);
        Conta conta2 = new Conta("Maria", 10000);

        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
*/

class Evento {
    private String nomeDoEvento;
    private String localDoEvento;
    private String inicioDoEvento;
    private String fimDoEvento;
    public int numeroDeParticipantes;

    public Evento(String nome, String local, String inicio, String fim, int num) {
        this.nomeDoEvento = nome;
        this.localDoEvento = local;
        this.inicioDoEvento = inicio;
        this.fimDoEvento = fim;
        this.numeroDeParticipantes = num;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getLocalDoEvento() {
        return localDoEvento;
    }

    public int getNumeroDeParticipantes() {
        return numeroDeParticipantes;
    }

    public void setNumeroDeParticipantes(int num) {
        this.numeroDeParticipantes = num;
    }

    public String toString() {
        String evento = "";
        evento = evento + "Nome: " + nomeDoEvento + "\n";
        evento = evento + "Local: " + localDoEvento + "\n";
        evento = evento + "Inicio: " + inicioDoEvento + "\n";
        evento = evento + "Fim: " + fimDoEvento + "\n";
        evento = evento + "Numero de participantes: " + numeroDeParticipantes + "\n"; 
        return evento;
    }

}


public class Aula3 {

    public static void main(String[] args) {

        Evento canadaGP = new Evento("GP DO CANANDA", "MONTREAL", "17/06/2022",
        "19/06/2022", 300000);

        System.out.print(canadaGP);

    }
}