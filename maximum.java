import java.math.BigInteger;
import java.util.Scanner;

public class maximum {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            BigInteger product = BigInteger.ONE;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                product = product.multiply(
                    BigInteger.valueOf(nums[j])
                );

                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                BigInteger result = BigInteger.valueOf(g)
                    .multiply(BigInteger.valueOf(l));

                if (product.equals(result)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}