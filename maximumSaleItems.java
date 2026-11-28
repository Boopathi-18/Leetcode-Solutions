import java.util.*;

public class maximumSaleItems {

    public static int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;
        int max = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            max = Math.max(max, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        int[] freq = new int[max + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        int[] count = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                count[i] += freq[j];
            }
            count[i]--;
        }

        Arrays.sort(items, (a, b) ->
            Integer.compare(a[1], b[1])
        );

        long ans = 0;
        long remaining = budget;

        for (int[] item : items) {

            int factor = item[0];
            int price = item[1];

            if (price > minPrice) {
                break;
            }

            int available = count[factor];

            if (available <= 0) {
                continue;
            }

            long buy = Math.min(remaining / price, available);

            ans += buy * 2;
            remaining -= buy * price;
        }

        ans += remaining / minPrice;

        return (int) ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] items = new int[n][2];

        for (int i = 0; i < n; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }

        int budget = sc.nextInt();

        System.out.println(maximumSaleItems(items, budget));

        sc.close();
    }
}