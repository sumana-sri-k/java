import java.util.*;

public class Solution {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size();
        int min = 0, max = 0;
        for (int i = 0; i < n - 1; i++) {
            min += arr.get(i);
        }
        for (int i = 1; i < n; i++) {
            max += arr.get(i);
        }
        System.out.print(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(scanner.nextInt());
        }
        miniMaxSum(arr);
    }
}
