package see;
import cie.*;
import java.util.Scanner;
public class External extends cie.Student{
	 public int externalm[]=new int[5];
	 Scanner in=new Scanner(System.in);
	 public void getExternals(){
		 for(int i=0;i<5;i++){
			 System.out.println("Enter your subject "+(i+1)+" marks : ");
			 externalm[i]=in.nextInt();
		 }
	 }
}