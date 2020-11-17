package cie;
import java.util.Scanner;
public class Student{
   public String name,usn;
   public int sem;
   Scanner in=new Scanner(System.in);
   public void get(){
      System.out.println("Enter name : ");
	  name=in.nextLine();
	  System.out.println("Enter Usn:");
	  usn=in.next();
	  System.out.println("Enter Semester:");
	  sem=in.nextInt();
	  }
	  }
 