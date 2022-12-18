import java.util.*;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Float height = input.nextFloat();
		input.nextLine();
		char sex = input.next().charAt(0);
		double pesoIdeal = 0;
		
		if(height < 0 || (sex != 'm' && sex != 'f')) {
			System.out.println("Entrada inválida!");
		}
		else if(sex == 'f') {
			pesoIdeal = (62.1 * height) - 44.7;
			System.out.printf("%.1f kg\n", pesoIdeal);
		}
		else if(sex == 'm') {
			pesoIdeal = (72.7 * height) - 58;
			System.out.printf("%.1f kg\n", pesoIdeal);
		}
		input.close();
	}

}



//Caso S = 'm' (masculino), peso_ideal = (72.7 x A) - 58;
//Caso S = 'f' (feminino), peso_ideal = (62.1 x A) - 44.7;