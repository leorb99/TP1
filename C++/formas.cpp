#include <iostream>
using namespace std;

class Retangulo {
    private:
        int comprimento = 1;
        int largura = 1;

    public:
        int perimetro() {
            return 2 * (comprimento + largura);
        }
        int area() {
            return comprimento * largura;
        }
        int getComprimento() {
            return comprimento;
        }
        int getLargura() {
            return largura;
        }
        void setComprimento(int comprimento) {
            if (comprimento > 0 && comprimento < 20){
                this->comprimento = comprimento;
            }
        }
        void setLargura(int largura) {
            if (largura > 0 && largura < 20){    
                this->largura = largura;
            }
        }
}; 

int main() {
    Retangulo retangulo1;
    Retangulo retangulo2;
    int largura1, comprimento1, largura2, comprimento2;
    cin >> comprimento1 >> largura1;
    cin >> comprimento2 >> largura2;

    retangulo1.setComprimento(comprimento1);
    retangulo1.setLargura(largura1);
    retangulo2.setComprimento(comprimento2);
    retangulo2.setLargura(largura2);

    cout << retangulo1.getComprimento() << " " << retangulo1.getLargura() << " "
    << retangulo1.perimetro() << " " << retangulo1.area() << endl; 
    cout << retangulo2.getComprimento() << " " << retangulo2.getLargura() << " "
    << retangulo2.perimetro() << " " << retangulo2.area() << endl; 

    return 0;
}