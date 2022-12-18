import java.util.*;

class Circulo {
    private int x, y, raio;
    public static final double PI = 3.14159;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() { 
        return x; 
    }

    public int getY() { 
        return y; 
    }

    public int getRaio() { 
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double circunferencia() {
        return 2 * PI * raio;
    }
}

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo1, circulo2, circulo3;
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int raio1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int raio2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int raio3 = input.nextInt();
        int novoRaio1 = input.nextInt();
        int novoRaio2 = input.nextInt();
        int novoRaio3 = input.nextInt();
        
        circulo1 = new Circulo(x1, y1, raio1);
        circulo2 = new Circulo(x2, y2, raio2);
        circulo3 = new Circulo(x3, y3, raio3);
        
        Circulo[] vetor1 = {circulo1, circulo2, circulo3};                                  //1
        Circulo[] vetor2 = vetor1;                                                          //2 e 3
        Circulo[] vetor3 = new Circulo[3];                                                  //4
        vetor3[0] = new Circulo(vetor1[0].getX(), vetor1[0].getY(), vetor1[0].getRaio());   //5
        vetor3[1] = new Circulo(vetor1[1].getX(), vetor1[1].getY(), vetor1[1].getRaio());   //5
        vetor3[2] = new Circulo(vetor1[2].getX(), vetor1[2].getY(), vetor1[2].getRaio());   //5


        vetor1[0].setRaio(novoRaio1);                                                       //6
        vetor1[1].setRaio(novoRaio2);                                                       //6
        vetor1[2].setRaio(novoRaio3);                                                       //6
        
        System.out.println("vetor1:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %d %d\n", vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
        }
        
        System.out.println("vetor2:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %d %d\n", vetor2[i].getX(), vetor2[i].getY(), vetor2[i].getRaio());
        }        
        
        System.out.println("vetor3:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %d %d\n", vetor3[i].getX(), vetor3[i].getY(), vetor3[i].getRaio());
        }
        input.close();
    }
}
