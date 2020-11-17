import cie.*;
import see.*;
import java.util.Scanner;
class StudentMain{
    public static void main(String args[]){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=ss.nextInt();
		int total[];
		int i,j;
		total=new int[5];
		cie.Internals in[]=new cie.Internals[n];
		see.External e[]=new see.External[n];
		for(i=0;i<n;i++){
			in[i]=new cie.Internals();
			e[i]=new see.External();
			System.out.println("Enter the details of student"+(i+1)+":");
			in[i].get();
			System.out.println("Enter internals marks:");
			in[i].getInternals();
			System.out.println("Enter externals marks:");
			e[i].getExternals();
		}
		for(i=0;i<n;i++){
			for(j=0;j<5;j++){
				total[j]=in[i].marks[j]+(e[i].externalm[j]/2);
				System.out.println("Total marks in subject"+(j+1)+":"+total[j]);
			}
		}
	}
}
				
		
		
