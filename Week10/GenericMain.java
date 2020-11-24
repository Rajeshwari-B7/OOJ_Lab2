import java.util.Scanner;
class Generic<A,B,C>{
	A ob1;
	B ob2;
	C ob3;
	Generic(A o1,B o2,C o3){
		ob1=o1;
		ob2=o2;
		ob3=o3;
	}
	void print(){
		System.out.println("The type of A is:"+ob1.getClass().getName());
		System.out.println("The type of B is:"+ob2.getClass().getName());
		System.out.println("The type of C is:"+ob3.getClass().getName());		
	}
	A get1(){
		return ob1;
	}
	B get2(){
		return ob2;
	}
	C get3(){
		return ob3;
	}
}
class GenericMain{
	public static void main(String args[]){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a character:");
		char c=ss.next().charAt(0);
		Generic<Character,Boolean,String> ob=new Generic<Character,Boolean,String>(c,true,"yes");
		ob.print();
		char x = ob.get1();
 		System.out.println("value: " + x);
 		boolean y = ob.get2();
 		System.out.println("value: " + y);
 		String s=ob.get3();
 		System.out.println("value: " + s);
	}
}