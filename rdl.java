import java.util.*;

public class rdl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] count = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            count[c - 'a']--;

            if (seen[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > c
                    && count[stack.peek() - 'a'] > 0) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            seen[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        System.out.println(result);

        sc.close();
    }
}