#include <iostream>

using namespace std;

int main(){

    float consumoDeEnergia;
    float valorDaEnergia;
    float taxaBasica = 5;
    float total;
    cout << fixed;
    cout.precision(2);

    cin >> consumoDeEnergia;

    if (consumoDeEnergia <= 500){
        valorDaEnergia = consumoDeEnergia * 0.02;
    }
    else if (consumoDeEnergia > 500 && consumoDeEnergia <= 1000){
        valorDaEnergia = (500 * 0.1) + ((consumoDeEnergia - 500) * 0.05);
    }
    else {
        valorDaEnergia = (1000 * 0.35) + ((consumoDeEnergia - 1000) * 0.1);
    }
    total = valorDaEnergia + taxaBasica;

    cout << valorDaEnergia << " " << taxaBasica << " " << total << endl;

    return 0;
}