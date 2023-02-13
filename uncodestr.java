import java.util.Scanner;

public class uncodestr {
    public static void main(String[] args){
        String n = "Harhsada vk";
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the indexes");
        int k = j.nextInt();
        int res = n.codePointAt(k);  //used to find the unicode of the lettter
        System.out.print(res);
        // to find the before unicode of the given string
        // str.codePointBefore(10);
    }
    
}
