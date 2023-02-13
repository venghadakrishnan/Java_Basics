import java.util.Arrays;

public class anagram {

    public static void main(String[] args){
        String s1 = "army";
        String s2 = "mary";
        System.out.print(har(s1, s2));
    }
        // to declare a boolean
        public static Boolean har(String s1,String s2){
        char [] firststr = s1.toLowerCase().toCharArray();
        char [] second = s2.toLowerCase().toCharArray();
        Arrays.sort(firststr);
        Arrays.sort(second);
        
        // if(firststr.equals(second))
        
        return Arrays.equals(firststr,second); 
    }
}

    

