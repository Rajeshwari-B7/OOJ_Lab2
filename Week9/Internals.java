package cie;
import java.util.Scanner;
public class Internals extends Student{
	 public int marks[]=new int[5];
	 Scanner in=new Scanner(System.in);
	 public void getInternals(){
		 for(int i=0;i<5;i++){
			 System.out.println("Enter your subject "+(i+1)+" marks : ");
			 marks[i]=in.nextInt();
		 }
	 }
}