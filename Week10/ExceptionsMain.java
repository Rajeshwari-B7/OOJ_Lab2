import java.util.Scanner;

class WrongAge extends Exception {
int age;

WrongAge(int x) {
age = x;
}

public String toString() {
return "Age entered is incorrect";
}
}

class father {
int a;
father(int x) {
a = x;
}
}

class son extends father {
int age;
son(int fage, int sage) {
super(fage);
age = sage;
}

void check() throws WrongAge {
if (age >= a || age<0 || a<0) {
throw new WrongAge(age);
}
else {
System.out.println("Correct ages entered");
System.out.println("Father's age:" + a + "\n" + "Son's age:" + age);
}
}
}

class ExceptionsMain {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter father's age:");
int f = sc.nextInt();
System.out.println("Enter son's age:");
int s = sc.nextInt();
son ss = new son(f, s);
try {
  ss.check();
  } 
catch (WrongAge e) {
System.out.println(" "+e);
}
}
}