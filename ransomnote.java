import java.util.Scanner;

public class ransomnote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();

        int[] count = new int[26];

        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        boolean result = true;

        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;

            if (count[ch - 'a'] < 0) {
                result = false;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}