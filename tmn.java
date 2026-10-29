import java.util.*;

public class tmn {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    TreeSet<Integer> set = new TreeSet<>();

    for (int num : nums) {
        set.add(num);

        if (set.size() > 3) {
            set.pollFirst();
        }
    }

    if (set.size() == 3) {
        System.out.println(set.first());
    } else {
        System.out.println(set.last());
    }

    sc.close();
}

}
