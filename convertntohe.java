import java.util.Scanner;

public class convertntohe  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("0");
        } else {
            String hex = "0123456789abcdef";
            StringBuilder result = new StringBuilder();

            while (num != 0) {
                result.append(hex.charAt(num & 15));
                num >>>= 4;
            }

            System.out.println(result.reverse());
        }

        sc.close();
    }
}