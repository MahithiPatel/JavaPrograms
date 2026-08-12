class account{
	int accountno;
	String accounttype;
	int accountbalance;
	 
	void setaccountdetails(int accountno,String accounttype,int accountbalance) {
		this.accountno=accountno;
		this.accounttype=accounttype;
		this.accountbalance=accountbalance;
	}
	 void withdraw(int amount) {
		 if(accountbalance>amount)
		 this.accountbalance-=amount;
		 else
			 System.out.println("Insuficent details");
	 }
	  void deposit(int amount) {
		  this.accountbalance+=amount;
	  }
	  void dispaccountdetails() {
		  System.out.println("acc no:"+accountno+"type: "+accounttype+"balance:"+accountbalance);
	  }
}
public class accdemo {

	public static void main(String[] args) {
		account a1=new account();
		a1.setaccountdetails(123467, "sb",10000);
		a1.dispaccountdetails();
		a1.deposit(1000);
		a1.dispaccountdetails();
		a1.withdraw(15000);
		a1.dispaccountdetails();

	}

}