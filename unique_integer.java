import java.util.*;

public class Solution {
    public static int lonelyinteger(List<Integer> a) {
        int n = a.size();
        int result = -1;

        for (int i = 0; i < n; i++) {
            int x = a.get(i);
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && x == a.get(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result = x;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        System.out.println(lonelyinteger(a));
    }
}
