import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*Scanner sc =new Scanner(System.in);
				System.out.println("Enter a number: ");
				int n = sc.nextInt();
				*/
				long f=1;
				System.out.println("|---------|-----------------|");
				System.out.println("|Number   |   factorial     |");
				System.out.println("|---------|-----------------|");

				for(int i =1;i<=5;i++) {
			    f=1;
			    for(int j=1;j<=i;j++) {
			    	f=f*j;
			    }
				System.out.println("|" +i+"        |          "+f);
				}
				System.out.println("|---------|-----------------|");


	}

}
