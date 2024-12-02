import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!res.contains(arr[i])) {
                        res.add(arr[i]);
                    }
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> duplicates = findDuplicates(arr);        
        for (int x : duplicates) {
            System.out.print(x + " ");
        }
    }
}
