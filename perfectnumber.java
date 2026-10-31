import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(false);
            return;
        }

        int sum = 1;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        System.out.println(sum == num);
    }
}