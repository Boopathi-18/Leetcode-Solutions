import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 1;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        boolean found = false;

        if (count1 > n / 3) {
            System.out.print(candidate1);
            found = true;
        }

        if (count2 > n / 3) {
            if (found) System.out.print(" ");
            System.out.print(candidate2);
            found = true;
        }

        if (!found) {
            System.out.print("No majority elements");
        }

        sc.close();
    }
}