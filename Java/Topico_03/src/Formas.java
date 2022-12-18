import java.util.*;

class Retangulo {
    private int comprimento = 1;
    private int largura = 1;

    public int perimetro() {
        int perimetro = 2 * (comprimento + largura);
        return perimetro;
    }

    public int area() {
        int area = comprimento * largura;
        return area;
    }

    public int getComprimento() {
        return comprimento;
    }
    
    public int getLargura() {
        return largura;
    }

    public void setComprimento(int comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }
    }
    
    public void setLargura(int largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        }
    }
}

public class Formas {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        Scanner input = new Scanner(System.in);
        int comprimento1 = input.nextInt();
        int largura1 = input.nextInt();
        int comprimento2 = input.nextInt();
        int largura2 = input.nextInt();

        retangulo1.setComprimento(comprimento1);
        retangulo1.setLargura(largura1);
        retangulo2.setComprimento(comprimento2);
        retangulo2.setLargura(largura2);

        System.out.printf("%d %d %d %d\n", retangulo1.getComprimento(),
        retangulo1.getLargura(), retangulo1.perimetro(), retangulo1.area());
        
        System.out.printf("%d %d %d %d\n", retangulo2.getComprimento(),
        retangulo2.getLargura(), retangulo2.perimetro(), retangulo2.area());

        input.close();
    }
}
