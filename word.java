
import java.util.*;

public class word  {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map1.containsKey(ch) && !map1.get(ch).equals(word)) {
                return false;
            }

            if (map2.containsKey(word) && map2.get(word) != ch) {
                return false;
            }

            map1.put(ch, word);
            map2.put(word, ch);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = sc.nextLine();
        String s = sc.nextLine();

        System.out.println(wordPattern(pattern, s));

        sc.close();
    }
}
