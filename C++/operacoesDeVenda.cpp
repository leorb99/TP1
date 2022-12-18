#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

int main(){

    int n;
    int qtd;
    string compra;
    unordered_map<string, int> estoque;
    vector<string> compras;
    cin >> n;
    

    for(int i = 0; i < n; i++){
        string produto;
        int quantidade;
        cin >> produto >> quantidade;
        compras.push_back(produto);
        estoque[produto] += quantidade;
    }

    do{
        cin >> compra;
        if (estoque.count(compra) > 0){
            cin >> qtd;
            cout << compra << " " << qtd << endl;
            estoque[compra] -= qtd;
        }
        else if (estoque.count(compra) == 0 && compra != "fim"){
            cout << compra << " produto não encontrado" << endl;
        }
    } while (compra != "fim");
    // TODO uma lista para manter a ordem de entrada
    // e imprimir essa lista combinada dos valores correspondentes no map
    
    for(int i = 0; i < n; i++){
        cout << compras[i] << " " << estoque[compras[i]] << endl;
    }

    return 0;
}