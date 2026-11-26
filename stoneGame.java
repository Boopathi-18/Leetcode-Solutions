import java.util.Scanner;

public class stoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int turn = 1;

        while (n >= turn) {
            n -= turn;
            turn++;
        }

        if (turn % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }

        sc.close();
    }
}