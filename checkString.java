public class checkString {
    public static void main(String[] args) {
        String s = "aaabbb";

        if (!s.contains("ba")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}