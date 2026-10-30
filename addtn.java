import java.util.*;

public class addtn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (char ch : a.toCharArray()) {
            s1.push(ch - '0');
        }

        for (char ch : b.toCharArray()) {
            s2.push(ch - '0');
        }

        Stack<Integer> result = new Stack<>();
        int carry = 0;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;

            if (!s1.isEmpty())
                sum += s1.pop();

            if (!s2.isEmpty())
                sum += s2.pop();

            result.push(sum % 10);
            carry = sum / 10;
        }

        while (!result.isEmpty()) {
            System.out.print(result.pop());
        }

        sc.close();
    }
}