/*Implement Interfaces – QUEUE OPERATIONS*/
import java.util.Scanner;
interface Inter{
	void insert(int a);
	void delete();
	void display();
}
class Queue implements Inter{
	int q[];
	int f=0,r=-1;
	Queue(int s){
		q=new int[s];
	}
	public void insert(int item){
		if(r==(q.length-1)){
			System.out.println("Queue is full");
		}
		else{
			r++;
			q[r]=item;
		}
	}
	public void delete(){
		if(f>r){
			System.out.println("Queue is empty");
			f=0;
			r=-1;
		}
		else
			f++;		
	}
	public void display(){
		if(f>r){
			System.out.println("Queue is empty");
		}
		else{		
		System.out.println("The contents of the queue:");
		for(int i=f;i<=r;i++){
			System.out.println(q[i]);
		}
	}
	}
}
class QueueMain{
	public static void main(String args[]){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the size of the queue:");
		int size=ss.nextInt();
		Queue ob=new Queue(size);
		for(;;){
			System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
			System.out.println("Enter your choice:");
			int choice=ss.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Enter the item to be inserted:");
				int item=ss.nextInt();
				ob.insert(item);
				break;
			}
			case 2:{
				ob.delete();
				break;
			}
			case 3:{
			 	ob.display();
			 	break;
			 }
			 default:{
			 	System.exit(0);
			 	break;
			 }
		}
	}
		}
}