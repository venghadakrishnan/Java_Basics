import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class strtoary {
    public static void main(String[] args){
        String[] str = {"I","Love","You","Harshada"};

        String s1 = arraytoString(str);
        System.out.println("Array to string by array to string converstion method"+s1);

        String s2 = strbuilder(str);
        System.out.println("Using String Builder"+s2);

        String s3 = UsingJoin(str);
        System.out.println("Using join method"+s3);

        String s4 = collectormethod(str);
        System.out.println("Using Collectors and joining"+s4);

    }


    public static String arraytoString(String[] str){
    return Arrays.toString(str);
    }


    public static String strbuilder(String[] str){
        StringBuilder some = new StringBuilder();
        for(int i =0;i<str.length;i++){
            some.append(str[i]);
        }
        return Arrays.toString(str);
    }

    public static String UsingJoin(String[] str) {
        String j = String.join(" ", str);
        return j;
    }

    public static String collectormethod(String[] str){
        String k = Arrays.stream(str).collect(Collectors.joining());
        return k;
    }
}
