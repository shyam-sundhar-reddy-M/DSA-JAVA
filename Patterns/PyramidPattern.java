import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        System.out.println("Enter N Value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
