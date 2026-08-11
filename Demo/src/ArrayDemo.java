import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int s= sc.nextInt();
        int sum = 0;
        int Arr[]= new int[s];
        for(int i=0;i<Arr.length;i++)
        {
        	System.out.println("Arr["+i+"]:");
        	Arr[i]= sc.nextInt();
        }
       for(int c:Arr) 
       {
	      System.out.print(c+" ");
	      sum+=c;
       }
       System.out.println("\nSum of array elements: "+sum);
	}
}
