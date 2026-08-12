import java.util.Scanner;
public class ItemDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option , itemNumber , quantity;
		double rate , price;
		String itemName;
		do {
			System.out.println("Enter item number: ");
			itemNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter item name: ");
			itemName = sc.nextLine();
			System.out.println("Enter rate: ");
			rate = sc.nextDouble();
			System.out.println("Enter quantity: ");
			quantity = sc.nextInt();
			price = rate*quantity;
			System.out.println("Item number: "+itemNumber+" Name: "+itemName+" Rate: "+rate);
			System.out.println("Enter option: ");
		}
		while (option != -1);
		System.out.println("Thakyou!");
	}
}
