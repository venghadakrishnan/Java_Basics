import java.util.Scanner;

public class arrayin {

    /**
     * @param args
     */
    public static void main(String[] args){
        Integer n;
        Scanner a = new Scanner(System.in);
        n = a.nextInt();

        //now we are converting into array
        int[] arr = new int[10];

        for(int i = 0 ; i<n;i++){
            arr[i] = a.nextInt(); 
        }

        //to print the array 
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]);
        }
    }
    
}

// to break the arry check out brkary.java"""

