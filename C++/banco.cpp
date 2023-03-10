#include <iostream>
#include <string>
using namespace std;

class Conta {
    private:
        int numeroConta, senha;
        string nomeCLiente;
        double saldo;
    
    public:
        Conta(int numeroConta, int senha, string nomeCLiente, double saldo) {
            this->numeroConta = numeroConta;
            this->senha = senha;
            this->nomeCLiente = nomeCLiente;
            this->saldo = saldo;
        }
        int getNumeroConta() {
            return numeroConta;
        }
        string getNomeCLiente() {
            return nomeCLiente;
        }
        double getSaldo(int senha) {
            if (senha == this->senha){
                return saldo;
            }
            return -1;
        }
        bool sacar(double valor, int senha) {
            if (valor > 0 && valor < this->saldo && senha == this->senha){
                saldo -= valor;
                return true;
            }
            return false;
        }
        bool depositar(double valor, int senha) {
            if (valor > 0 && senha == this->senha){
                saldo += valor;
                return true;
            }
            return false;
        }
        bool transferir(double valor, int senha, Conta contaDeDestino) {
            if (valor > 0 && valor < this->saldo && senha == this->senha){
                this->saldo -= valor;
                contaDeDestino.saldo += valor;
                return true;
            }
            return false;
        }
};

int main() {
    int numeroConta1, numeroConta2, senha1, senha2;
    string nomeCLiente1, nomeCLiente2;
    double saldo1, saldo2;
    cin >> numeroConta1 >> senha1 >> nomeCLiente1 >> saldo1;
    cin >> numeroConta2 >> senha2 >> nomeCLiente2 >> saldo2;
    Conta conta1(numeroConta1, senha1, nomeCLiente1, saldo1);
    Conta conta2(numeroConta2, senha2, nomeCLiente2, saldo2);

    cout << fixed;
    cout.precision(2);
    int op;
    int senha;
    double valor, saldo;
    string nomeCliente;

    do {
        cin >> op;
        switch (op) {
            case 1: 
                cin >> senha;
                saldo = conta1.getSaldo(senha);
                if (saldo < 0) {
                    cout << "senha incorreta" << endl;
                } else {
                    cout << saldo << endl;
                }
                break;
            case 2:
                cin >> valor >> senha;
                if (conta1.sacar(valor, senha)) {
                    cout << "saque realizado" << endl;
                } else {
                    cout << "saque n??o realizado" << endl;
                }    
                break;
            case 3:
                cin >> valor >> senha;
                if (conta1.depositar(valor, senha)) {
                    cout << "dep??sito realizado" << endl;
                } else {
                    cout << "dep??sito n??o realizado" << endl;
                }
                break;
            case 4:
                cin >> nomeCliente;
                if (nomeCliente == conta2.getNomeCLiente()) {
                    cin >> valor >> senha;
                    if (conta1.transferir(valor, senha, conta2)) {
                        cout << "transfer??ncia realizada" << endl;
                    } else {
                        cout << "transfer??ncia n??o realizada" << endl;
                    }
                } else {
                    cout << "nenhum usu??rio encontrado" << endl;
                }
                break;
        }
    } while (op != 5);

    return 0;
}