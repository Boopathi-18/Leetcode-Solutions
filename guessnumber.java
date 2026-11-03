import java.util.Scanner;

public class guessnumber {

    static int pick = 6;

    static int guess(int num) {
        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int left = 1;
        int right = n;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int res = guess(mid);

            if (res == 0) {
                ans = mid;
                break;
            } else if (res == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}