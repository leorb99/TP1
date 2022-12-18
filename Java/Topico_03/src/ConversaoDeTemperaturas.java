import java.util.*;

class Temperatura {
    private double temperatura;

    public Temperatura(double temp) {
        this.temperatura = temp;
    }
    
    public void celsiusToFahrenheit() {
        this.temperatura = temperatura * 1.8 + 32;
    }
    
    public void fahrenheitToCelsius() {
        this.temperatura = (temperatura - 32) * (5.0 / 9.0);
    }

    public String toString() {
        String temp = "";
        temp += "temperatura: " + temperatura;
        return temp;
    }
}

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        double temperatura = input.nextDouble();
        Temperatura conversor = new Temperatura(temperatura);

        conversor.celsiusToFahrenheit();
        System.out.println(conversor + " graus fahrenheit");
        conversor.fahrenheitToCelsius();
        System.out.println(conversor + " graus celsius");

        input.close();   
    }
}