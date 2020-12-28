/*Write a program to create a thread and find the sum of odd numbers from 1 to 100 in
this thread. Find the sum of even numbers for the same range in the main thread.*/
class SumThread implements Runnable{
	Thread t;
	String name;
	int sum=0,i;
	SumThread(String tname){
		name=tname;
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(i=1;i<100;i++){
				if(i%2==1)
					sum=sum+i;
			}
			Thread.sleep(50);
		}
		catch(InterruptedException e){
			System.out.println(name +"Interrupted");
		}
		System.out.println("Sum of odd number="+sum);
	}
}
class MainThread{
	public static void main(String args[]){
		int sum=0,i;
		SumThread n1=new SumThread("Sum");
		try{
			for(i=1;i<=100;i++){
				if(i%2==0)
					sum=sum+i;
			}
			Thread.sleep(50);
		}
		catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.println("Sum of even numbers="+sum);
	}
}