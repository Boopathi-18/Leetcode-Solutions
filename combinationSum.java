import java.util.*;

public class combinationSum {

    static void combinationSum(int[] arr, int target, int start,
                               List<Integer> current) {

        if (target == 0) {
            System.out.println(current);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] <= target) {
                current.add(arr[i]);

                combinationSum(arr, target - arr[i], i, current);

                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        combinationSum(candidates, target, 0, new ArrayList<>());
    }
}