import java.util.Arrays;

public class Exercise4 {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j <= Math.min(i + n, a.length - 1); j++) {
                    a[i] += a[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int[] b = {1, -1, -1, 10, 5, -1};
        int n = 3;
        windowPosSum(a, n);
        windowPosSum(b,2);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
