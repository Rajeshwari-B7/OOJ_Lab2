import java.util.Scanner;
class Employee{
	String empid,empname;
	int emphrs;
	double empbasic,emphra,empda,empit,empgross;
	Scanner in=new Scanner(System.in);
	void accept(){
		System.out.println("Enter your name and id:");
		empname=in.next();
		empid=in.next();
		System.out.println("Enter the number of hours:");
		emphrs=in.nextInt();
		System.out.println("Enter your basic salary:");
		empbasic=in.nextDouble();
		System.out.println("Enter emphra,empda,empit:");
		emphra=in.nextDouble();
		empda=in.nextDouble();
		empit=in.nextDouble();
	}
	void calc(){
		empgross=empbasic+(emphra*empbasic)/100+(empda*empbasic)/100-(empit*empbasic)/100;
		if(emphrs>=200)
			empgross+=emphrs*100;
		else
			empgross-=emphrs*100;
		System.out.println("The gross salary is"+empgross);
	}
}
class Employeemain{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of Employee:");
		int n=in.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++){
			e[i]=new Employee();
			System.out.println("Enter the number of Employee"+(i+1));
			e[i].accept();
		}
		for(int i=0;i<n;i++){
			System.out.println("Employee"+(i+1));
			e[i].calc();
		}
	}
}