#include <iostream>
#include <string>
using namespace std;

class Impressora {
    public:
        string modelo, cor, tipoPapel;
        bool bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;
        
        void ligar() {
            if (!ligada) {
                ligada = true;
                cout << "ligando..." << endl;
            }
        }
        void desligar() {
            if (ligada) {
                ligada = false;
                cout << "desligando..." << endl;
            }
        }
        void imprimir() {
            if (ligada && papel) {
                cout << "imprimindo..." << endl;
            }
            else if (ligada && !papel) {
                cout << "sem papel" << endl;
            }
            else {
                cout << "impressora desligada" << endl;
            }
        }
        void digitalizar() {
            if (ligada && digitalizadora) {
                cout << "digitalização sendo realizada..." << endl;
            }
            else if (ligada && !digitalizadora) {
                cout << "não é possível digitalizar" << endl;
            }
            else {
                cout << "impressora desligada" << endl;
            }                                                                                                                                                                                                                                                                                       
        }
        void copiar() {
            if (ligada && copiadora) {
                cout << "copia sendo realizada..." << endl;
            }
            else if (ligada && !copiadora) {
                cout << "não é possível copiar" << endl;
            }
            else {
                cout << "impressora desligada" << endl;
            }
        }
        void status() {
            cout << modelo << endl;
            cout << cor << endl;
            cout << tipoPapel << endl;

            if (bluetooth) {
                cout << "bluetooth on" << endl;
            } else {
                cout << "bluetooth off" << endl;
            }

            if (wifi) {
                cout << "wifi on" << endl;
            } else {
                cout << "wifi off" << endl;
            }

            if (colorida) {
                cout << "impressão colorida" << endl;
            } else {
                cout << "impressão preto e branco" << endl;
            }

            if (ligada) {
                cout << "impressora on" << endl;
            } else {
                cout << "impressora off" << endl;
            }

            if (papel) {
                cout << "tem papel" << endl;
            } else {
                cout << "não tem papel" << endl;
            }

            if (digitalizadora) {
                cout << "digitalizadora on" << endl;
            } else {
                cout << "digitalizadora off" << endl;
            }

            if (copiadora) {
                cout << "copiadora on" << endl;
            } else {
                cout << "copiadora off" << endl;
            }
        }
};

int main() {
    Impressora impressora;
    impressora.bluetooth = true;
    impressora.wifi = true;
    impressora.colorida = true;
    impressora.ligada = false;
    impressora.papel = true;
    impressora.digitalizadora = true;
    impressora.copiadora = false;

    string modelo, cor, tipoPapel;
    cin >> modelo >> cor >> tipoPapel;

    impressora.modelo = modelo;
    impressora.cor = cor;
    impressora.tipoPapel = tipoPapel;

    impressora.status();
    impressora.ligar();
    impressora.digitalizar();
    impressora.copiar();
    impressora.desligar();
    impressora.imprimir();

    return 0;
}