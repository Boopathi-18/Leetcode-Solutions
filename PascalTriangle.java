import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rowIndex = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            for (int j = result.size() - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }

            result.add(1);
        }

        System.out.println(result);

        sc.close();
    }
}