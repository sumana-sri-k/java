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
        System.out.println(check(str)?"YES":"NO");
	}
    public static boolean check(String str){
        if (str.length()==0){
            return true;
        }

        if(str.charAt(0)=='a'){
            if(str.length()==1 || str.length()>=2 && str.charAt(1)=='a'){
                return check(str.substring(1));
            }
            else if(str.length()>=3 && str.charAt(1)=='b' && str.charAt(2)=='b'){
                return check(str.substring(3));
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
