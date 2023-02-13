import java.lang.reflect.Array;
import java.util.Arrays;

public class sample {

    public static void main (String[] args){
        String s1 = "army";
        String s2 = "mary";
        System.out.print(ana(s1, s2));
    }

    public static Boolean ana(String s1, String s2){
        //  to check the string Array
        char [] a = s1.toLowerCase().toCharArray();
        char [] b = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b)
        return Arrays.equals(a,b);
}
    }
