import java.util.Scanner;
public class FindBigSmallFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Array size: ");
     int s = sc.nextInt();
     int []Arr = new int[s];
     int big = Integer.MIN_VALUE;
     int secondBig = Integer.MIN_VALUE;
     int small = Integer.MAX_VALUE;
     int secondSmall = Integer.MAX_VALUE;
     for(int i=0;i<s;i++) {
    	 System.out.println("Arr["+i+"]: ");
    	 Arr[i] = sc.nextInt();
     }
     if(s>2) {
    	 for(int n: Arr) {
    	// 	 System.out.println(n);
    		 if(n>big) {
    			 secondBig = big;
    			 big=n;
    		 }
    		 else if(n>secondBig && secondBig!=big) {
    			secondBig = n; 
    		 }
    	 }   // add small and second small logic
    	 for(int n:Arr) {
    		 if (n<small)  
    		 {
    			secondSmall= small;
    			small = n;
    		 }
    		 else if(n < secondSmall && secondSmall != small) {
    			 secondSmall = n;
    		 }
    	 }
    	 System.out.println("Big : " +big+ "\nsecondBig : "+secondBig);
         System.out.println("Small: " +small+ "\nsecondSmall: "+secondSmall);
     }
     else {
    	 System.out.println("2 element array not possible");
     }
     
	}
     }
