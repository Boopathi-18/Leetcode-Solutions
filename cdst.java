import java.util.Scanner;

public class cdst {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    String arriveAlice = sc.next();
    String leaveAlice = sc.next();
    String arriveBob = sc.next();
    String leaveBob = sc.next();

    int startAlice = convert(arriveAlice);
    int endAlice = convert(leaveAlice);
    int startBob = convert(arriveBob);
    int endBob = convert(leaveBob);

    int start = Math.max(startAlice, startBob);
    int end = Math.min(endAlice, endBob);

    if (start > end) {
        System.out.println(0);
    } else {
        System.out.println(end - start + 1);
    }

    sc.close();
}

static int convert(String date) {
    int[] days = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    int month = Integer.parseInt(date.substring(0, 2));
    int day = Integer.parseInt(date.substring(3, 5));

    int total = day;

    for (int i = 0; i < month - 1; i++) {
        total += days[i];
    }

    return total;
}

}