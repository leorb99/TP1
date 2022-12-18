#include <iostream>

using namespace std;

int main(){

    int homens = 0;
    int mulheres = 0;
    float ingressoHomens = 0;
    float ingressoMulheres = 0; 
    float totalIngresso = 0;
    char chegada;
    cout << fixed;
    cout.precision(2);

    do {
        cin >> chegada;
        if (chegada == 'h') {
            homens++;
        }
        else if (chegada == 'm') {
            mulheres++;
        }
    } while (chegada != 'q');

    ingressoMulheres = mulheres * 7.4;
    ingressoHomens = homens * 12.5;

    totalIngresso = ingressoMulheres + ingressoHomens;
    cout << homens << " " << mulheres << endl;
    cout << ingressoHomens << " " << ingressoMulheres << " " << totalIngresso << endl;
    
    return 0;
}