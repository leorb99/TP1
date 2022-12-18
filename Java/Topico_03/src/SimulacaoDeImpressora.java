import java.util.*;

class Impressora {
    public String modelo, cor, tipoPapel;
    public boolean bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;

    public void ligar() {
        if (!ligada) {
            System.out.println("ligando...");
            ligada = true;
        }
    }

    public void desligar() {
        if (ligada) {
            System.out.println("desligando...");
            ligada = false;
        }
    }

    public void imprimir() {
        if (ligada && papel) {
            System.out.println("imprimindo...");
        }
        else if (ligada && !papel) {
            System.out.println("sem papel");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void digitalizar() {
        if (ligada && digitalizadora) {
            System.out.println("digitalização sendo realizada...");
        }
        else if (ligada && !digitalizadora) {
            System.out.println("não é possível digitalizar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void copiar() {
        if (ligada && copiadora) {
            System.out.println("cópia sendo realizada");
        }
        else if (ligada && !copiadora) {
            System.out.println("não é possível copiar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void status() {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipoPapel);

        if (bluetooth) {
            System.out.println("bluetooth on");
        } else {
            System.out.println("bluetooth off");
        }

        if (wifi) {
            System.out.println("wifi on");
        } else {
            System.out.println("wifi off");
        }

        if (colorida) {
            System.out.println("impressão colorida");
        } else {
            System.out.println("impressão preto e branco");
        }

        if (ligada) {
            System.out.println("impressora on");
        } else {
            System.out.println("impressora off");
        }

        if (papel) {
            System.out.println("tem papel");
        } else {
            System.out.println("não tem papel");
        }

        if (digitalizadora) {
            System.out.println("digitalizadora on");
        } else {
            System.out.println("digitalizadora off");
        }

        if (copiadora) {
            System.out.println("copiadora on");
        } else {
            System.out.println("copiadora off");
        }
    }

}

public class SimulacaoDeImpressora {
    public static void main(String[] args){
        Impressora impressora = new Impressora();
        Scanner input = new Scanner(System.in);

        impressora.bluetooth = true;
        impressora.wifi = true;
        impressora.colorida = true;
        impressora.ligada = false;
        impressora.papel = true; 
        impressora.digitalizadora = true;
        impressora.copiadora = false;

        String modelo, cor, tipoPapel;
        modelo = input.next();
        cor = input.next();
        tipoPapel = input.next();

        impressora.modelo = modelo;
        impressora.cor = cor;
        impressora.tipoPapel = tipoPapel;

        impressora.status();
        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();

        input.close();
    }

}