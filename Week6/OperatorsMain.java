import java.util.Scanner;
class Operator{
    int operand1,operand2,result1,result2;
    void arithmetic(int op1,int op2){
        System.out.println("ARITHMETIC CATEGORY:");
        System.out.println();
        result1=(op1+op2);
        result2=(op1*op2);
        System.out.println("Addition:"+result1);
        System.out.println("Multiplication:"+result2);
        System.out.println();
    }
   
    void relational(int op1,int op2){
        System.out.println("RELATIONAL CATEGORY:");
        System.out.println();
        boolean m=op1>op2;
        boolean n=op1<=op2;
        if (m){
            System.out.println(op1+" is greater than "+op2);
        }
        else{
            System.out.println(op2+" is greater than "+op1);
        }
        if (n){
            System.out.println(op1+" is less than or equal to "+op2);
        }
        else{
            System.out.println(op2+" is less than or equal to "+op1);
        }
        System.out.println();
    }
    void assignment(int op1,int op2){
        System.out.println("ASSIGNMENT CATEGORY:");
        System.out.println();
        boolean z=(op1==op2);
        if (z){
            System.out.println(op1+" is equal to "+op2);
        }
        else{
            System.out.println(op1+" is not equal to "+op2);
        }
        System.out.println();
    }
    void logical(int op1,int op2){
        System.out.println("LOGICAL CATEGORY:");
        System.out.println();
        result1=(op1 & op2);
        result2=(op1 | op2);
        System.out.println("Bitwise and between "+op1+" and "+op2+" : "+result1);
        System.out.println("Bitwise or between "+op1+" and "+op2+" : "+result2);
        System.out.println();
    }
}
class OperatorsMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Operator o=new Operator();
        System.out.println("Input operand1:");
        int o1=s.nextInt();
        System.out.println("Input opearand 2:");
        int o2=s.nextInt();
        o.arithmetic(o1,o2);
        o.relational(o1,o2);
        o.assignment(o1,o2);
        o.logical(o1,o2);
    }
}
