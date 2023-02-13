import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class brkary {

    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<Integer>();
        System.out.print("Enteer the numbers");

        while(s.hasNextInt()){  //while we have integer as next while getting the input
            n.add(s.nextInt());  //we are adding the numbers in the ArrayList where the varible is n

            LinkedList<Integer> l = new LinkedList<>(); //to make the input numbers in asceding order
            Collections.sort(n); // in asceding order

            // Collections.sort(n,Collections.reverseOrder());  //to make the reverse order n,Collections.reverseOrder().

        }

        s.next();       //if some other inputs are given rather than numbers the loop breaks and show the array
        System.out.print("the numbers are"+n);
    }

}
