import java.util.*;

public class ConsumoDeEnergiaEletrica {

	public static void main(String[] args) {
		
		double value;
		double basicFee = 5;
		double total;
		Scanner input = new Scanner(System.in);
		float consumption = input.nextFloat();
	
		if(consumption <= 500) {
			value = consumption * 0.02;
		}
		else if(consumption > 500 && consumption <= 1000) {
			value = (500 * 0.1) + ((consumption - 500) * 0.05);
		}
		else {
			value = (1000 * 0.35) + ((consumption - 1000) * 0.1);
		}
		total = value + basicFee;
		System.out.printf("%.2f %.2f %.2f\n", value, basicFee, total);
		input.close();
	}

}
