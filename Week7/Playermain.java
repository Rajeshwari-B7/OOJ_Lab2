import java.util.Scanner;
class Player{
 String name;
 int matches_played,runs;
 double average;
 Scanner ss=new Scanner(System.in);
 void getdata(){
  System.out.println("Enter the name:");
  name=ss.nextLine();
  System.out.println("Enter the number of matches played:");
  matches_played=ss.nextInt();
  System.out.println("Enter the number of runs scored:");
  runs=ss.nextInt();
 }
 void cal_average(String name,int matches_played,int runs){
  this.name=name;
  this.matches_played=matches_played;
  this.runs=runs;
  average=runs/matches_played;
 }
}
class BATSMAN extends Player{
 int runs_scored;
 void setdata(){
  runs_scored=runs;
 }
 void display(){
  System.out.println("Name:"+name);
  System.out.println("Number of Matches played:"+matches_played);
  System.out.println("Runs:"+runs_scored);
  System.out.println("Average score:"+average);
 } 
}
class BOWLER extends Player{
 int runs_given;
 void setdata(){
  runs_given=runs;
 }
  void display(){
  System.out.println("Name:"+name);
  System.out.println("Number of Matches played:"+matches_played);
  System.out.println("Runs:"+runs_given);
  System.out.println("Average score:"+average);
 }
}
class Playermain{
 public static void main(String args[]){
  Scanner ss=new Scanner(System.in);
  System.out.println("Enter the number of Batsmen:");
  int m=ss.nextInt();
  System.out.println("Enter the number of Bowlers:");
  int n=ss.nextInt();
  BATSMAN bt[]=new BATSMAN[m];
  BOWLER bw[]=new BOWLER[n];
  for(int i=0;i<m;i++){
   bt[i]=new BATSMAN();
   System.out.println("------Enter the details of Batsman No."+(i+1)+"--------");
   bt[i].getdata();
  }
  for(int i=0;i<n;i++){
   bw[i]=new BOWLER();
   System.out.println("------Enter the details of Bowler No."+(i+1)+"---------");
   bw[i].getdata();
  }
  for(int i=0;i<m;i++){
   System.out.println("Details of Batsman No."+(i+1));
   bt[i].cal_average(bt[i].name,bt[i].matches_played,bt[i].runs);
   bt[i].setdata();
   bt[i].display();
  }
  for(int i=0;i<n;i++){
   System.out.println("Details of Bowler No."+(i+1));
   bw[i].cal_average(bw[i].name,bw[i].matches_played,bw[i].runs);
   bw[i].setdata();
   bw[i].display();
  }
 }
}