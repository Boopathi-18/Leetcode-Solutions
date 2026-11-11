import java.util.Scanner;

public class eliminationgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while (remaining > 1) {
            if (left || remaining % 2 == 1) {
                head += step;
            }

            remaining /= 2;
            step *= 2;
            left = !left;
        }

        System.out.println(head);

        sc.close();
    }
}