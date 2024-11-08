import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = n / 2;
        int p = n - q;
        int[] even = new int[p];
        int[] odd = new int[q];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = arr[i];
            } else {
                odd[oddIndex++] = arr[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        int sum = 0;
        if (p > 1) {
            sum += even[p - 2];  // Second largest in even array
        }
        if (q > 1) {
            sum += odd[q - 2];    // Second largest in odd array
        }

        System.out.println(sum);
    }
}
