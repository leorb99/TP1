#include <iostream>

using namespace std;

int main(){

    float pesoIdeal;
    float altura;
    char sexo;

    cin >> altura;
    cin >> sexo;
    cout << fixed;
    cout.precision(1);

    if (altura < 0 || (sexo != 'm' && sexo != 'f')) {
        cout << "Entrada inválida!" << endl;
    }
    else if (sexo == 'm') {
        pesoIdeal = (72.7 * altura) - 58;
        cout << pesoIdeal << " kg" << endl;
    }
    else if (sexo == 'f'){
        pesoIdeal = (62.1 * altura) - 44.7;
        cout << pesoIdeal << " kg" << endl;
    }

    return 0;
}