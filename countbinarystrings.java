import java.util.Scanner;

public class countbinarystrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else if (n <= 3) {
            System.out.println(1);
        } else {
            int[] arr = new int[n + 1];

            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 2;

            int head = 2;
            int tail = 3;
            int num = 1;
            int count = 1;

            while (tail < n) {
                for (int i = 0; i < arr[head] && tail < n; i++) {
                    arr[tail] = num;

                    if (num == 1) {
                        count++;
                    }

                    tail++;
                }

                num = 3 - num;
                head++;
            }

            System.out.println(count);
        }

        sc.close();
    }
}