import java.util.Scanner;  
public class MatrixTranspose  
{  
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("Enter order of matrix: ");  
    Scanner in = new Scanner(System.in);  
    int row = in.nextInt();  
    int column = in.nextInt();  
    int array[][] = new int[row][column];  
    System.out.println("Enter matrix:");  
    for(i = 0; i < row; i++)  
    {  
        for(j = 0; j < column; j++)   
            {  
            array[i][j] = in.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("The matrix before Transpose is");  
    for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
            System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("The matrix after Transpose is ");  
    for(i = 0; i < column; i++)  
        {  
            for(j = 0; j < row; j++)  
            {  
                System.out.print(array[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
} 