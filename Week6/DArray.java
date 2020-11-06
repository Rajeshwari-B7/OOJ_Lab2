import java.util.Scanner;
class DArray {
    public static void main(String[] args){
        int i,j;
        double temp;
        double[] a=new double[args.length];
        for (i=0;i< args.length;i++){
            a[i]=Double.parseDouble(args[i]);
        }
        for (i=0;i< args.length;i++){
            for (j=(i+1);j< args.length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (i=0;i< args.length;i++){
            System.out.printf("%f\t",a[i]);
        }
    }
}