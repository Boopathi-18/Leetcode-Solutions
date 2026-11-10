import java.util.Scanner;

public class integerbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 3) {
            System.out.println(n - 1);
        } else {
            int result = 1;

            while (n > 4) {
                result *= 3;
                n -= 3;
            }

            result *= n;

            System.out.println(result);
        }

        sc.close();
    }
}