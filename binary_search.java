import java.util.Scanner;

class BinarySearch {
    int binarySearch(int a[], int l, int r, int x) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                return m;
            } else if (a[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int x = sc.nextInt();
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(a, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
