import java.util.Scanner;

public class ControleDeAcessoDePessoas {

	public static void main(String[] args) {

		int men = 0;
		int women = 0;
		double menTicket = 0;
		double womenTicket = 0;
		double totalTicket = 0;
		char arrived;
		
		Scanner input = new Scanner(System.in);
		do {
			arrived = input.next().charAt(0);
			if(arrived == 'h') {
				men++;
			}
			else if(arrived == 'm') {
				women++;
			}
		} while(arrived != 'q');
		
		menTicket = men * 12.5;
		womenTicket = women * 7.4;
		totalTicket = menTicket + womenTicket;
		System.out.printf("%d %d\n", men, women);
		System.out.printf("%.2f %.2f %.2f\n", menTicket, womenTicket, totalTicket);
		input.close();
	}
		
}
