package my_week_06;

public class CodingBatXYZ {
    public static void main(String[] args) {
        String str = "abc.xyz";
        System.out.println(xyzThere(str));
    }
    public static boolean xyzThere(String str) {
        if(str.contains("xyz")){
            for(int i = 0 ; i <= str.length() -1 ; i++){
                if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z'){
                    if((i == 0) || (str.charAt(i-1) != '.')){
                        return true;
                    }
                }
            }
        }else{
            return false;
        }
        return false;
    }

}
