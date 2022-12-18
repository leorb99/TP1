import java.util.*;

public class OperacoesDeVenda {
	
	public static void main(String[] args) {
		
		String purchase = "";
		int quantity;
		int newValue;
		Scanner input = new Scanner(System.in);
		ArrayList<Object> inventory = new ArrayList <>();    
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String product = input.next();
			int qtt = input.nextInt();
			inventory.add(product);
			inventory.add(qtt);
		}
		
		do{
			purchase = input.next();
			input.nextLine();
			if (inventory.contains(purchase)) {
				quantity = input.nextInt();
				int index = inventory.indexOf(purchase);
				newValue = (int) (inventory.get(index+1)) - quantity;
				inventory.set(index+1, newValue);
				System.out.printf("%s %d\n", purchase, quantity);
			}
			else if (!(inventory.contains(purchase)) && !purchase.equals("fim")) {
				System.out.printf("%s produto não encontrado\n", purchase);
			}
		} while (!purchase.equals("fim"));
		
		int length = inventory.size();
		
		for(int i = 0; i < (length); i+=2) {
			System.out.println(inventory.get(i)+" "+inventory.get(i+1));
		}
		input.close();
	}

}
