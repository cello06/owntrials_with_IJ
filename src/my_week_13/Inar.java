package my_week_13;

public class Inar {
    public static void main(String[] args) {
        String test = "Inar Academy";
        System.out.println("is Duplicate :" + isDuplicate(test));
    }

    public static boolean isDuplicate(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isDuplicate2(String word) {
        boolean[] alphabet = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (alphabet[currentChar]) {
                return false;
            }
            alphabet[currentChar - 'a'] = true;

        }
        return true;
    }
}
