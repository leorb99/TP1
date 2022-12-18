import java.util.*;

public class CalculoDoIPTU {

	public static void main(String[] args) {
		
		double iptu = 0;
		Scanner input = new Scanner(System.in);
		int type = input.nextInt();
		int area = input.nextInt();
		boolean valid = true;
		
		if(type == 1 && area > 0) {
			if(area < 200) {
				iptu = area;
			}
			else {
				iptu = area * 1.2;
			}
		
		}
		else if(type == 2 && area > 0) {
			if(area < 200) {
				iptu = area * 1.1;
			}
			else {
				iptu = area * 1.3;
			}
		
		}
		else {
			valid = false;
			System.out.println("Entrada inválida!");
		}
		if(valid == true) {
			System.out.printf("%.2f\n", iptu);
		}
		input.close();
	}

}
