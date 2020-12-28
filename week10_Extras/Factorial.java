/*Write a Java program to compute the factorial of a number. The input value must be tested
for validity. If it is greater than 15, the method ComputeFactorial( ) should raise an
Userdefined Exception MyException with appropriate messages.*/
import java.util.Scanner;
class MyException extends Exception{
private int detail;
MyException(int a) {
detail = a;
}
public String toString() {
return "Input "+detail+" is greater than 15";
}
}
class Factorial{
	static void ComputeFactorial(int a) throws MyException{
		int fact=1;
		if(a>15)
			throw new MyException(a);
		else{
			for(int i=1;i<=a;i++)
				fact=fact*i;
			System.out.println("Fcatorial of "+a+" is:"+fact);
		}
	}  
	public static void main(String args[]){
		try{
			Scanner ss=new Scanner(System.in);
			int f;
			System.out.println("Enter a number:");
			f=ss.nextInt();
			ComputeFactorial(f);
		}
		catch(MyException e){
			System.out.println("Caught Exception:"+e);
		}
	}
}