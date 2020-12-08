class Thread1 implements Runnable {
String name; 
Thread t;
int sec;
Thread1(String threadname,int seconds) {
sec=seconds;
name = threadname;
t = new Thread(this, name);
t.start();
}

public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(i+"  "+name);
Thread.sleep(sec);
}
} catch (InterruptedException e) {
System.out.println(name + "Interrupted");
}
}
}

class Thread2 {
public static void main(String args[]) {
Thread1 n1=new Thread1("BMS College of Engineering",10000); 
Thread1 n2=new Thread1("CSE",2000);
}
}