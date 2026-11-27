import java.util.Scanner;

public class maxnumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] items = new int[n][2];

        for (int i = 0; i < n; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }

        int budget = sc.nextInt();

        int[] dp = new int[budget + 1];
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int factor = items[i][0];
            int price = items[i][1];

            minPrice = Math.min(minPrice, price);

            int free = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % factor == 0) {
                    free++;
                }
            }

            for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j],
                        dp[j - price] + free + 1);
            }
        }

        int ans = 0;

        for (int i = 0; i <= budget; i++) {
            ans = Math.max(ans,
                    dp[i] + (budget - i) / minPrice);
        }

        System.out.println(ans);

        sc.close();
    }
}