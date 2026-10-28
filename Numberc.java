import java.util.Scanner;

public class Numberc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int mask = 1;

    while (mask < num) {
        mask = (mask << 1) | 1;
    }

    int result = num ^ mask;

    System.out.println(result);

    sc.close();
}
}
