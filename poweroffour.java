import java.util.Scanner;

public class poweroffour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
        } else {
            while (n % 4 == 0) {
                n = n / 4;
            }

            System.out.println(n == 1);
        }

        sc.close();
    }
}