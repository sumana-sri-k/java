import java.util.Scanner;

class Result {

    public static String timeConversion(String s) {
        char c = s.charAt(8);
        int time = Integer.parseInt(s.substring(0, 2));
        if (c == 'p' || c == 'P') {
            if (time < 12) {
                time += 12;
            }
        } else {
            if (time == 12) {
                time = 0;
            }
        }
        String t = String.valueOf(time);
        String T;
        if (t.length() == 1) {
            T = "0" + t;
        } else {
            T = t;
        }
        T += s.substring(2, 8);
        return T;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(timeConversion(s));
    }
}
