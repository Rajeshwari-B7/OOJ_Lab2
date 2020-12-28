/*Develop a multithreaded Java program to create three threads. First thread generates
random integer for every second and if the value is even, second thread computes the
square of number and prints. If the value is odd, the third thread will print the value of
cube of number.*/
import java.util.Random;
class Thread1 implements Runnable{
	String name1;
	Thread t;
	static int rand;
	int i,n,seconds;
	Random rd = new Random();
	Thread1(String name,int sec,int num){
		name1=name;
		seconds=sec;
		n=num;
		t=new Thread(this,name1);
		t.start();
	}
	public void run(){
	try{
		if(n==1){
		for(i=0;i<7;i++){
		rand=rd.nextInt(8);
		System.out.println("random no:"+rand);
		Thread.sleep(seconds);
	}
	}
	else if(n==2){
		for(i=0;i<3;i++){
			if((rand%2)==0){
				System.out.println("random no:"+rand+" sqaure:"+rand*rand);
			}
			Thread.sleep(seconds);
		}
	}
	else if(n==3){
		for(i=0;i<3;i++){
			if(rand%2!=0){
				System.out.println("random no:"+rand+" cube:"+rand*rand*rand);
			}
			Thread.sleep(seconds);
		}
	}
}
	catch(InterruptedException e){
		System.out.println(name1+" Caught");
	}
}
}
class ThreadMain{
	public static void main(String args[]){
		Thread1 t1=new Thread1("name 1",1000,1);
		Thread1 t2=new Thread1("name 2",1000,2);
		Thread1 t3=new Thread1("name 3",1000,3);
		
	}
}