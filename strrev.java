import java.util.Scanner;

public class strrev {
    public static void main(String[] args){

    String str , rev="";
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string:");
    str = sc.nextLine();

    for(int i =str.length()-1;i>=0;i--)
        rev = rev+str.charAt(i);
    
    System.out.print(rev);
    }
}
