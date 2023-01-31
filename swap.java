import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        int x, y,temp;
        System.out.print("Enter the two number ");
        Scanner s = new Scanner(System.in);
        
        x= s.nextInt();
        y = s.nextInt();

        // temp = x;
        // x = y;
        // y = temp;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.print("After swapping"+x+" "+y);

    }
    
}
