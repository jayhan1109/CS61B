public class Exercise1B {
    public static void main(String[] args) {
        drawTriangle(10);
    }

    public static void drawTriangle(int N){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
