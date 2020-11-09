import java.util.Scanner;
class Person{
String name;
int age;
Scanner ss=new Scanner(System.in);
void getdata(){
System.out.println("Enter your name:");
name=ss.nextLine();
System.out.println("Enter your age:");
age=ss.nextInt();
}
}
class Employee extends Person{
String id;
double salary;
Scanner ss=new Scanner(System.in);
void getidsalary(){
System.out.println("Enter your ID:");
id=ss.next();
System.out.println("Enter your salary:");
salary=ss.nextDouble();
}
}
class Nonteaching extends Employee{
String field;
Scanner ss=new Scanner(System.in);
void getfield(){
System.out.println("Enter the field you work in:");
field=ss.nextLine();
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("ID:"+id);
System.out.println("Salary:"+salary);
System.out.println("Field working in:"+field);
}
}
class Teaching extends Employee{
String subject;
Scanner ss=new Scanner(System.in);
void getsub(){
System.out.println("Enter the subject you teach:");
subject=ss.nextLine();
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("ID:"+id);
System.out.println("Salary:"+salary);
System.out.println("Subject teaching:"+subject);
}
}
class Student extends Person{
String usn;
int sem;
Scanner ss=new Scanner(System.in);
void getusnsem(){
System.out.println("Enter your USN:");
usn=ss.nextLine();
System.out.println("Enter your sem:");
sem=ss.nextInt();
}
}
class UG extends Student {
String dep;
Scanner ss=new Scanner(System.in);
void getdep(){
System.out.println("Enter your department:");
dep=ss.nextLine();
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("USN:"+usn);
System.out.println("Semester:"+sem);
System.out.println("Department:"+dep);
}
}
class PG extends Student {
String special;
Scanner ss=new Scanner(System.in);
void getspecial(){
System.out.println("Enter your specialisation:");
special=ss.nextLine();
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("USN:"+usn);
System.out.println("Semester:"+sem);
System.out.println("Specialization:"+special);
}
}
class Personmain{
public static void main(String args[]){
char choice;
int emp,stu;
Scanner ss=new Scanner(System.in);
System.out.println("Enter e if your're an employee and s if your're a student:");
choice=ss.next().charAt(0);
if(choice=='e'){
System.out.println("Enter 1 if your're a teaching staff and 2 if your're a non teaching staff:");
emp=ss.nextInt();
if(emp==1){
Teaching t=new Teaching();
t.getdata();
t.getidsalary();
t.getsub();
t.display();
}
else{
Nonteaching n=new Nonteaching();
n.getdata();
n.getidsalary();
n.getfield();
n.display();
}
}
else{
System.out.println("Enter 1 if your're an UG student and 2 if your're a PG student:");
stu=ss.nextInt();
if(stu==1){
UG u=new UG();
u.getdata();
u.getusnsem();
u.getdep();
u.display();
}
else{
PG p=new PG();
p.getdata();
p.getusnsem();
p.getspecial();
p.display();
}
}
}
}