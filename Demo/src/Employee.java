class Employeee{
	int empNum;
	String empName;
	double empSalary;
	Employeee(){
		
	}
	Employeee(int empnum,String empname)
	{
		this.empNum=empnum;
		this.empName=empname;
	}
	Employeee(int empnum,String empname,double empsalary)
	{
		this(empnum,empname);
		this.empSalary=empsalary;
	}
	void dispEmpDetails() 
	{
		System.out.println("Employee No: "+empNum+" Employee Name: "+empName+" Salary: "+empSalary);
		
	}
}
public class employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e1=new Employeee();
		e1.dispEmpDetails();
		Employeee e2=new Employeee(101,"Bob",50000);
		e2.dispEmpDetails();
		Employeee e3=new Employeee(101,"shuhas",900000);
		e3.dispEmpDetails();
		
		
		
	}
}
