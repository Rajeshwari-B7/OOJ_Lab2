import java.util.Scanner;
class StringCount{
public static void main(String args[]){
System.out.println("Enter a string:");
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
s=s.toLowerCase();
int x=0,y=0,z=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
x++;
else if(s.charAt(i)==' ')
y++;
else
z++;
}
System.out.println("The number of vowels are "+x+" , number of consonants are "+z+" and number of spaces are "+y);
}
}
