import java.util.Scanner;
class Age{
     Scanner in=new Scanner(System.in);
     int years,months;
     void getdata(){
        System.out.println("Enter the number of years and months");
        years=in.nextInt();
        months=in.nextInt();
     }
     void calc(Age a2){
       if(years>a2.years)
            System.out.println("A1 is older than A2");
       else if(a2.years>years)
            System.out.println("A2 is older than A1");
       else{
         if(months>a2.months)
              System.out.println("A1 is older than A2");
         else if(months<a2.months)
              System.out.println("A2 is older than A1");
         else
              System.out.println("A2 and A1 are of same age");
       }
    }
}
class Agemain{
    public static void main(String args[]){
       Age a1=new Age();
       Age a2=new Age();
       System.out.println("For A1");
       a1.getdata();
       System.out.println("For A2");
       a2.getdata();
       a1.calc(a2);
    }
}    
