import java.util.Scanner; 

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Check if the string length is valid
        if (str.length() == 0 || str.length() % 2 == 0) {
            System.out.println("-1");
        } else {
            for (int i = 1; i < str.length(); i += 2) {
                char a = str.charAt(i - 1);
                char b = str.charAt(i + 1);
                char op = str.charAt(i);
                char result = operations(op, a, b);
                if(i==str.length()-2){
                    System.out.println(result);
                }
            }
        }
    }

    public static char operations(char op, char a, char b) {
        if (op == 'A') {
            return and(a, b);
        } else if (op == 'B') {
            return or(a, b);
        } else if (op == 'C') {
            return xor(a, b);
        }
        return '0'; // Default case if no valid operator
    }

    public static char and(char a, char b) {
        if (a == '0' && b == '0') {
            return '0';
        } else if (a == '0' && b == '1') {
            return '0';
        } else if (a == '1' && b == '0') {
            return '0';
        } else if (a == '1' && b == '1') {
            return '1';
        }
        return '0'; // Default case
    }

    public static char or(char a, char b) {
        if (a == '0' && b == '0') {
            return '0';
        } else if (a == '0' && b == '1') {
            return '1';
        } else if (a == '1' && b == '0') {
            return '1';
        } else if (a == '1' && b == '1') {
            return '1';
        }
        return '0'; // Default case
    }

    public static char xor(char a, char b) {
        if (a == '0' && b == '0') {
            return '0';
        } else if (a == '0' && b == '1') {
            return '1';
        } else if (a == '1' && b == '0') {
            return '1';
        } else if (a == '1' && b == '1') {
            return '0';
        }
        return '0'; // Default case
    }
}
