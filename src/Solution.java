//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "2\n" +
            "0 2 10\n" +
            "5 3 5";
        Scanner scanner = new Scanner(mockInput);
        int q = scanner.nextInt();
        for (int q1 = 0; q1 < q; q1++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int multiplier = 1;
            int show = 0;
            for (int n1 = 1; n1 <= n; n1++) {
                if (n1 == 1) { show += a + (b * multiplier); }
                else { show += (b * multiplier); }
                System.out.printf("%d ", show);
                multiplier *= 2;
            }
            System.out.printf("%n");
        }
        scanner.close();
    }
}