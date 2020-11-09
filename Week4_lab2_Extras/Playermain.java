import java.util.Scanner;
class Player{
int id,no_matches_played;
String name;
double scores,average;
Player(int id1,String name1,double scores1,int no_matches_played1){
id=id1;
name=name1;
scores=scores1;
no_matches_played=no_matches_played1;
}
double avg_scores(){
average=scores/(double)no_matches_played;
System.out.println(average);
return average;
}
void printdata(){
System.out.println("Name:"+name);
System.out.println("ID:"+id);
System.out.println("Score:"+scores);
System.out.println("Number of matches played:"+no_matches_played);
System.out.printf("Average score=%.2f",average);
}
}
class Playermain{
public static void main(String args[]){
double avg1,avg2;
Player p1=new Player(34,"abc",456.6,5);
Player p2=new Player(21,"xyz",674.43,8);
System.out.println("Average of Player 1:");
avg1=p1.avg_scores();
System.out.println("Average of Player 2:");
avg2=p2.avg_scores();
System.out.println("The player with a greater average score is:");
if(avg1>avg2)
p1.printdata();
else
p2.printdata();
}
}