#include <iostream>
#include <vector>
using namespace std;

class Circulo {
    private:
        int x, y, raio;
    public:
        const double PI = 3.14159;
        Circulo(int x, int y, int raio) {
            this->x = x;
            this->y = y;
            this->raio = raio;
        }
        Circulo() {
            this->x = 0;
            this->y = 0;
            this->raio = 0;
        }
        int getX() {
            return x;
        }
        int getY() {
            return y;
        }
        int getRaio() {
            return raio;
        }
        void setRaio(int raio) {
            this->raio = raio;
        }
        double circunferencia() {
            return 2 * PI * raio;
        }
};

int main() {
    int x1, y1, raio1, x2, y2, raio2, x3, y3, raio3, novoRaio1, novoRaio2, novoRaio3;
    cin >> x1 >> y1 >> raio1;
    cin >> x2 >> y2 >> raio2;
    cin >> x3 >> y3 >> raio3;
    cin >> novoRaio1;
    cin >> novoRaio2;
    cin >> novoRaio3;

    Circulo circulo1(x1, y1, raio1);
    Circulo circulo2(x2, y2, raio2);
    Circulo circulo3(x3, y3, raio3);

    vector<Circulo> vetor1 = {circulo1, circulo2, circulo3};
    vector<Circulo> vetor2 = vetor1;
    vector<Circulo> vetor3;
    vetor3.push_back(circulo1);
    vetor3.push_back(circulo2);
    vetor3.push_back(circulo3);
    
    vetor1[0].setRaio(novoRaio1);
    vetor1[1].setRaio(novoRaio2);
    vetor1[2].setRaio(novoRaio3);

    cout << "vetor1:" << endl;
    for(int i = 0; i < 3; i++) {
        cout << vetor1[i].getX() << " " << vetor1[i].getY() << " " << vetor1[i].getRaio() << endl;
    }
    
    cout << "vetor2:" << endl;
    for(int i = 0; i < 3; i++) {
        cout << vetor2[i].getX() << " " << vetor2[i].getY() << " " << vetor2[i].getRaio() << endl;
    } 
    
    cout << "vetor3:" << endl;
    for(int i = 0; i < 3; i++) {
        cout << vetor3[i].getX() << " " << vetor3[i].getY() << " " << vetor3[i].getRaio() << endl;
    }
    return 0;
}