import java.util.HashMap;
import java.util.Scanner;

// Write a Java Program to count the number of words in a string using HashMap.

public class strcount {
    public static void main(String[] args){
        String str = "In this method, we are initializing a string variable called str with the value of your given string. Then, we are converting that string into a character array with the toCharArray() function. Thereafter, we are using for loop to iterate between each character in reverse order and printing each character.";
        String[] split = str.split(" ");
      
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i = 0;i<split.length;i++){
            if(map.containsKey(split[i])){
                int count = map.get(split[i]);
                map.put(split[i],count+1);
            }else{
                map.put(split[i],1);
            }
        }
        System.out.println(map);
    }
}


//code to find a single word how many times it get placed


// String str = "In this method, we are initializing a string variable called str with the value of your given string. Then, we are converting that string into a character array with the toCharArray() function. Thereafter, we are using for loop to iterate between each character in reverse order and printing each character.";
// String[] split = str.split(" ");
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a word ");
// String word = sc.nextLine();
// int count = 0;
// for(int i = 0;i<split.length;i++){

// if(word.equals(split[i])){
//     count++;
// }
// System.out.println(word);
// System.out.println(count);
// }