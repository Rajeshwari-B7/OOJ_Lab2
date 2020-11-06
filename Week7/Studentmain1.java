import java.util.Scanner;
class Student{
  String usn,name;
  int sem;
  Scanner ss=new Scanner(System.in);
  void getdata(){
    System.out.println("Enter the name of the student:");
    name=ss.nextLine();
    System.out.println("Enter the USN of the student:");
    usn=ss.next();
    System.out.println("Enter the semester:");
    sem=ss.nextInt();
  }
  void display1(){
    System.out.println("Name:"+name);
    System.out.println("USN:"+usn);
    System.out.println("Semester:"+sem);
  }
}
class Test extends Student{
  int cie[];
  int m;
  int credits[];
  void getciemarks(){
    Scanner ss=new Scanner(System.in);
    System.out.println("Enter number of subjects:");
    m=ss.nextInt();
    cie=new int[m];
    credits=new int[m];
    for(int i=0;i<m;i++){
      System.out.println("Enter the cie marks and credits of subject "+(i+1)+":");
      cie[i]=ss.nextInt();
      credits[i]=ss.nextInt();
    }
    }
    void display2(){
      for(int i=0;i<m;i++){
        System.out.println("Subject "+(i+1)+":");
        System.out.println("CIE marks:"+cie[i]);
        System.out.println("Credits:"+credits[i]);
      }
      
    }
}
class Exam extends Test{
  int see[];
  void getseemarks(){
    Scanner ss=new Scanner(System.in);
    see=new int[m];
    for(int i=0;i<m;i++){
      System.out.println("Enter the SEE marks of subject "+(i+1)+":");
      see[i]=ss.nextInt();
    }
  }
  void display3(){
    for(int i=0;i<m;i++){
      System.out.println("SEE marks:"+see[i]);
  }
}
}
class Result extends Exam{
  double total[],total1=0,sgpa;
  int credit=0;
  int grade[];
  void calc_result(){
    grade=new int[m];
    total=new double[m];
    for(int i=0;i<m;i++){
      total[i]=(see[i]/2)+cie[i];
    }
    for(int i=0;i<m;i++){
      if(total[i]>=90)
        grade[i]=10;
      else if(total[i]>=80)
        grade[i]=9;
      else if(total[i]>=70)
        grade[i]=8;
      else if(total[i]>=60)
        grade[i]=7;
      else if(total[i]>=50)
        grade[i]=6;
      else if(total[i]>=40)
        grade[i]=5;
      else 
        grade[i]=4;
      total1+=grade[i]*credits[i];
      credit+=credits[i];
    }
    sgpa=total1/credit;
  }
  void display(){
    System.out.println("SGPA:"+sgpa);
  }
}
class Studentmain1{
  public static void main(String args[]){
    Scanner ss=new Scanner(System.in);
    int i;
    System.out.println("Enter the number of students:");
    int n=ss.nextInt();
    Result r[]=new Result[n];
    for(i=0;i<n;i++){
      r[i]=new Result();
      System.out.println("--------Enter the details of student "+(i+1)+"-------");
      r[i].getdata();
      r[i].getciemarks();
      r[i].getseemarks();
    }
    for(i=0;i<n;i++){
      System.out.println("------Details of student "+(i+1)+":--------");
      r[i].display1();
      r[i].display2();
      r[i].display3();
      r[i].calc_result();
      r[i].display();
    }
  }
}