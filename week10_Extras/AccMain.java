/*Write a Java program to create an account class. Define appropriate constructor for this
class. Implement a separate methods to display account balance and withdraw money.
Raise a user defined exception if there is an attempt to withdraw money which is greater
than the account balance. Make necessary assumptions required.*/
import java.util.Scanner;
class MyException extends Exception{
	private double a;
	MyException(double b){
		a=b;
	}
	public String toString(){
		return "Withdrawal amount "+a+" is greater than the balance";
	}
}
class Account{
	double bal,wd;
	final double min=100.0;
	Account(){
		bal=0.0;
		wd=0.0;
	}
	void get(){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter your balance amount:");
		bal=ss.nextDouble();
		System.out.println("Enter withdrawal amount:");
		wd=ss.nextDouble();
	}
	void calc() throws MyException{
		if(wd>bal-min)
			throw new MyException(wd);
		bal-=wd;
	}
	void display(){
		System.out.println("The balance before withdrawal was:"+(bal+wd));
		System.out.println("The withdrawal amount:"+wd);
		System.out.println("The balance after withdrawal is:"+bal);
	}
}
class AccMain{
	public static void main(String args[]){
		try{
			Account ob=new Account();
			ob.get();
			ob.calc();
			ob.display();
		}
		catch(MyException e){
			System.out.println("Caught exception: "+e);
		}
	}
}