import java.util.Scanner;  

import java.lang.Math.*;

class CircleDemoMain
{  
   double radius,area,perimeter;
	void Accept()
	{
	System.out.println("Enter radius:");
    Scanner in=new Scanner(System.in);
     radius=in.nextDouble();
	}
	 void AreaCircle()
	 {
	 area=Math.PI*(radius*radius);
	 }
	 void PerimeterCircle()
	 {
	 perimeter=2*Math.PI*radius;
	 }
		 void Display()
		 {
		 System.out.println("Area is:"+area);
		  System.out.println("Perimeter is:"+perimeter);
		 }
   }
  public class CircleDemo
   {
    public static void main(String args[])
	{
	
		CircleDemoMain area=new CircleDemoMain();
		area.Accept();
		area.AreaCircle();
		area.PerimeterCircle();
		area.Display();
	}
   }