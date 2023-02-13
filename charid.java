import java.util.Scanner;

public class charid {
    public static void main(String[] args){
       String vk = "venkat vk";

       Scanner n = new Scanner(System.in);
       System.out.println("Enter the indexs");
       int v = n.nextInt();
       int index = vk.charAt(v);
       System.out.print((char)index);
    }
    
}

// to find the charaxter indexes..       """charAt()"""
