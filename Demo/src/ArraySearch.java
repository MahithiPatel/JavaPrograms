import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int s= sc.nextInt();
        int k , f =-1;
        int Arr[]= new int[s];
        for(int i=0;i<Arr.length;i++)
        {
        	System.out.println("Arr["+i+"]:");
        	Arr[i]= sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        k = sc.nextInt();
       for(int i=0;i<Arr.length;i++) 
       {
    	   if(k==Arr[i]) 
    	   {
    		   f=i;
    		   break;
    	   }
       }
       if(f>=0) {
	      System.out.print(k+ " found at index "+f);
       } else {
		System.out.println(k+ "Not found");
	}

}
}
