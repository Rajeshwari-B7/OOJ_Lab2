import java.util.Scanner;
class Fullarray{
public static void main(String args[]){
Scanner ss=new Scanner(System.in);
int a[][];
int p=0,q=0;
int pos[],neg[];
int k=0,l=0,z=0;
System.out.println("Enter the number of rows:");
int m=ss.nextInt();
System.out.println("Enter the number of columns:");
int n=ss.nextInt();
a=new int[m][n];
System.out.println("Enter the elements:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.println("a["+i+"]["+j+"]=");
a[i][j]=ss.nextInt();
}
}
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
if(a[i][j]>0)
k++;
if(a[i][j]<0)
l++;
if(a[i][j]==0)
z++;
}
}
pos=new int[k];
neg=new int[l];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
if(a[i][j]>0){
pos[p]=a[i][j];
p++;
}
if(a[i][j]<0){
neg[q]=a[i][j];
q++;
}
}
}
System.out.println("The elements of positive array:");
for(int i=0;i<k;i++)
System.out.println(pos[i]);
System.out.println("The elements of negative array:");
for(int i=0;i<l;i++)
System.out.println(neg[i]);
System.out.println("The number of positives is "+k+", number of negatives is "+l+" and number of zeroes is "+z);
}
}
