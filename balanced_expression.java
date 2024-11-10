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
        boolean result=valid(str);
        System.out.println(result);
	}
    public static boolean valid(String exp){
        Stack<Character> stack=new Stack<>();
        for(char c:exp.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(!match(top,c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    } 
    public static boolean match(char open,char close){
        return (open=='(' && close==')') || (open=='{'&&close=='}') || (open=='['&&close==']');
    }

}
