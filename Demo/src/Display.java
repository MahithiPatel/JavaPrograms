public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++) {
        	if(i==5) continue; // i%5==0;  5,10[doesn't print]
        	System.out.println(i+ " ");
        }
	}

}
