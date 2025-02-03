import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int num : arr) {
            if (num > 0) positiveCount++;
            else if (num < 0) negativeCount++;
            else zeroCount++;
        }

        int n = arr.size();
        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        plusMinus(arr);

        scanner.close();
    }
}
