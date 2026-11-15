import java.util.Scanner;
import java.util.Stack;

public class increasingtriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] < third) {
                found = true;
                break;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop();
            }

            stack.push(nums[i]);
        }

        System.out.println(found);

        sc.close();
    }
}