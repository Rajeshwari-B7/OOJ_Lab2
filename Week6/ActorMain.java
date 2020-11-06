import java.util.Scanner;
class Actor{
 String id,name;
 int no_of_movies,no_of_years_exp;
 static double highest_avg=0;
 static String high_name;
 double avg_perf;
 Scanner ss=new Scanner(System.in);
 void accept(){
  System.out.println("Enter the actor id:");
  id=ss.next();
  System.out.println("Enter the actor name:");
  name=ss.next();
  System.out.println("Enter the number of movies:");
  no_of_movies=ss.nextInt();
  System.out.println("Enter the number of years of experience:");
  no_of_years_exp=ss.nextInt();
 }
 void avg_performance(){
  avg_perf=no_of_movies/no_of_years_exp;
  /*if(avg_perf>highest_avg)
   highname=name;*/
 }
}
class ActorMain{
 public static void main(String args[]){
  Scanner ss=new Scanner(System.in);
  int i;
  System.out.println("Enter the number of actors:");
  int n=ss.nextInt();
  Actor a[]=new Actor[n];
  for(i=0;i<n;i++){
   a[i]=new Actor();
   System.out.println("---------------Enter the details of actor "+(i+1)+"----------------");
   a[i].accept();
   a[i].avg_performance();
  }
  for(i=0;i<n;i++){
   if(a[i].avg_perf>Actor.highest_avg){
    Actor.highest_avg=a[i].avg_perf;
    Actor.high_name=a[i].name;
   }
  }
  System.out.println("The actor with highest average performance is:"+Actor.high_name);
 }
}