import java.util.*;

class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    public Conta(int numeroConta, int senha, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getnomeCliente() {
        return nomeCliente;
    }

    public double getSaldo(int senha) {
        if (senha == this.senha) {
            return saldo;
        }
        return -1;
    }

    public boolean sacar(double valor, int senha) {
        if (valor > 0 && valor < this.saldo && senha == this.senha) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor, int senha) {
        if (valor > 0 && senha == this.senha) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, int senha, Conta contaDestino) {
        if (valor > 0 && valor < this.saldo && senha == this.senha){
            saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }
        return false;
    }
}

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroConta1 = input.nextInt();
        int senha1 = input.nextInt();
        String nomeCliente1 = input.next();
        double saldo1 = input.nextDouble();
       
        int numeroConta2 = input.nextInt();
        int senha2 = input.nextInt();
        String nomeCliente2 = input.next();
        double saldo2 = input.nextDouble();

        Conta conta1 = new Conta(numeroConta1, senha1, nomeCliente1, saldo1);
        Conta conta2 = new Conta(numeroConta2, senha2, nomeCliente2, saldo2);

        int op = 0;
        do {
            op = input.nextInt();
            switch (op) {
                case 1:
                    int senha = input.nextInt();
                    double saldo = conta1.getSaldo(senha);
                    if (saldo < 0) {
                        System.out.println("senha incorreta");
                    } else {
                        System.out.printf("%.2f\n", saldo);
                    }
                    break;
                case 2:
                    double valor = input.nextDouble();
                    senha = input.nextInt();
                    if (conta1.sacar(valor, senha)) {
                        System.out.println("saque realizado");
                    } else {
                        System.out.println("saque não realizado");
                    }
                    break;
                case 3:
                    valor = input.nextDouble();
                    senha = input.nextInt();
                    if (conta1.depositar(valor, senha)) {
                        System.out.println("depósito realizado");
                    } else {
                        System.out.println("depósito não realizado");
                    }
                    break;
                case 4:
                    String nomeCliente = input.next();
                    if (nomeCliente.equals(conta2.getnomeCliente())) {
                        valor = input.nextDouble();
                        senha = input.nextInt();
                        if (conta1.transferir(valor, senha, conta2)) {
                            System.out.println("transferência realizada");
                        } else {
                            System.out.println("transferência não realizada");
                        }
                    } else {
                        System.out.println("nenhum usuário encontrado");
                    }
                    break;
            } 
        } while (op != 5);

        input.close();
    }
}