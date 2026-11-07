import java.util.Scanner;

public class guessnumberhigherorlowerii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] dp = new int[n + 1][n + 1];

        for (int len = 2; len <= n; len++) {
            for (int start = 1; start + len - 1 <= n; start++) {
                int end = start + len - 1;
                dp[start][end] = Integer.MAX_VALUE;

                for (int k = start; k < end; k++) {
                    int cost = k + Math.max(dp[start][k - 1], dp[k + 1][end]);
                    dp[start][end] = Math.min(dp[start][end], cost);
                }
            }
        }

        System.out.println(dp[1][n]);

        sc.close();
    }
}