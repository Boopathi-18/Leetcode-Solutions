import java.util.*;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {

                if (sign == '+')
                    stack.push(num);
                else if (sign == '-')
                    stack.push(-num);
                else if (sign == '*')
                    stack.push(stack.pop() * num);
                else if (sign == '/')
                    stack.push(stack.pop() / num);

                sign = c;
                num = 0;
            }
        }

        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println(result);
    }
}