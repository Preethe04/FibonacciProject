public class Fibonacci {
    public static int[] generate(int n) {
        if (n < 0) throw new IllegalArgumentException("Count must be non-negative");
        int[] series = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) series[i] = i;
            else series[i] = Math.addExact(series[i - 1], series[i - 2]);
        }
        return series;
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci Series:");
        for (int number : generate(10)) System.out.print(" " + number);
        System.out.println();
    }
}
