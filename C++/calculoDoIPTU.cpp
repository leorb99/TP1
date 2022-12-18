#include <iostream>

using namespace std;

int main(){

    int tipo;
    int area;
    float iptu;
    bool flag = true;
    cout << fixed;
    cout.precision(2);

    cin >> tipo;
    cin >> area;

    if (tipo == 1 && area > 0) {
        if (area < 200) {
            iptu = area;
        }
        else {
            iptu = area * 1.2;
        }
    }
    else if (tipo == 2 && area > 0) {
        if (area < 200) {
            iptu = area * 1.1;
        }
        else {
            iptu = area * 1.3;
        }
    }    
    else {
        flag = false;
    }
    
    if (flag) {
        cout << iptu << endl;
    }
    else {
        cout << "Entrada inválida!" << endl;
    }

    return 0;
}