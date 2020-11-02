public class Exercise2 {
    /**
     * Returns the maximum value from m.
     */
    public static int max(int[] m) {
        int maxNum = Integer.MIN_VALUE;

        for (int num : m) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
