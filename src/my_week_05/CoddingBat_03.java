package my_week_05;

public class CoddingBat_03 {
    public static void main(String[] args) {
        String trying = "Celalettin";
        String returnType = altPairs(trying);
        System.out.println(returnType);
    }

    public static String altPairs(String str) {
        int count = 0;
        int lengthOfStr = str.length();
        String newStr = "";
        if (lengthOfStr == 0) {
            return str;
        }


        do {
            newStr += "" + str.charAt(count);
            if (count % 2 == 0) {
                count++;
            } else {
                count += 3;
            }
        } while (count < lengthOfStr);

        return newStr;
    }
}
