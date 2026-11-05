import java.util.Scanner;

public class countnumberswithuniquedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
        } else {
            int count = 10;
            int unique = 9;
            int available = 9;

            for (int i = 2; i <= n && i <= 10; i++) {
                unique = unique * available;
                count += unique;
                available--;
            }

            System.out.println(count);
        }

        sc.close();
    }
}