package my_week_05;

public class CoddingBat_02 {
    public static void main(String[] args) {
       boolean isTrue = doubleX("axaxax");
        System.out.println(isTrue);
    }
    static boolean doubleX(String str){

        if(str.length()>=2) {
            if (str.contains("x")) {
                int lastIndexOfX = str.lastIndexOf('x');
                if (str.charAt(lastIndexOfX - 1) == 'x') {
                    return true;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}
