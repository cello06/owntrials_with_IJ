package my_week_02;
import java.lang.reflect.*;
import java.util.*;

public class JavaReflection {
    public static void main(String[] args) {
        Class <Takvim> takvimClass=Takvim.class;
        Method[] methods=takvimClass.getDeclaredMethods();

         Arrays.sort(methods,(a,b) -> a.getName().compareTo(b.getName()));

        for(Method method : methods){
            System.out.println(method.getName());
        }

    }
}
