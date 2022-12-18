#include <iostream>
#include <string>
#include <sstream>
using namespace std;

class Temperatura {
    private:
        double temperatura;

    public:
        Temperatura(double temperatura) {
            this->temperatura = temperatura;
        }
        void celsiusToFahrenheit() {
            this->temperatura = (this->temperatura * 9 / 5) + 32;
        }
        void fahrenheitToCelsius() {
            this->temperatura = (this->temperatura - 32) * 5 / 9;
        }
        const string toString() const {
            stringstream sstm;
            sstm << "temperatura: " << temperatura << " graus";
            return sstm.str();
        }
};

int main() {
    double temperatura;
    cin >> temperatura;
    Temperatura conversor(temperatura);

    conversor.celsiusToFahrenheit();
    cout << conversor.toString() << " fahrenheit" << endl;
    conversor.fahrenheitToCelsius();
    cout << conversor.toString() << " celsius" << endl;
    return 0;
}