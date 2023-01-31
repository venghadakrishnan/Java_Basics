import java.util.Scanner;

class pali{
    public static void main(String[] args){
        String str,rev=" ";
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string");
        str = obj.nextLine();

        int l = str.length();

        for(int i = l-1;i >= 0;i--)
            rev = rev+str.charAt(i);
            
        if(str.equals(rev))
        System.out.println("palindrome");
        else
        System.out.println("not a palindrome");
        System.out.println("not a palindrome");


        
    }
}

