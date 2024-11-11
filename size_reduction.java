import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        if (n == 0) {
            System.out.println("");
            return;
        }
        
        StringBuilder result=new StringBuilder();

        for(int i=0;i<n;i++){
            char current=str.charAt(i);
            int count=1;
            for(int j=i+1;j<n;j++){
                if(str.charAt(j)==current){
                    count++;
                }else{
                    break;
                }
            }
            result.append(current);
            if(count>1){
                result.append(count);
            }

            i=i+count-1;
        }
        System.out.println(result.toString());
	}
}
