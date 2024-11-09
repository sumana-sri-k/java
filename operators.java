import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(c>4){
            System.out.println("enter proper value");
        }else{
            System.out.println(operationChoices(c,a,b));
        }
	}
    public static int operationChoices(int c, int a , int b ){
        if(c==1){
            return a+b;
        }else if(c==2){
            return a-b;
        }else if(c==3){
            return a*b;
        }else if(c==4){
            return a/b;
        }
        return 0;
    }
}
