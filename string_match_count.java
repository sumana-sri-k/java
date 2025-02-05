import java.util.*;

public class Solution {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        int s = strings.size();
        int q = queries.size();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int count = 0;
            String a = queries.get(i);
            for (int j = 0; j < s; j++) {
                String b = strings.get(j);
                if (a.equals(b)) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scanner.nextLine());
        }
        List<Integer> results = matchingStrings(strings, queries);
        for (int result : results) {
            System.out.println(result);
        }
    }
}
