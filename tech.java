public class tech {
    public static void main(String[] args){
        int[] numbers = new int[500];
        // int[] arr = new int[100];
        // for(int i =0 ;i<arr.length;i++){
        //     arr[i] = i+1;
        // }
        //     // System.out.println(arr[i]);
        // for(int i = 0; i <arr.length;i++){
        //     for(int j = i+1; j< arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println(arr[i]);
        //         }
            
        //     } 
        // for (int i = 0; i < numbers.length; i++) {
        //     numbers[i] = i + 1;
        // }
        
        // check for duplicate numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i +1;
            for (int j = i + 1; j < numbers.length; j++) {
                // if (numbers[i] == numbers[j])
                if (i != j && numbers[i] == numbers[j])  {
                    // System.out.println("Duplicate found: " + numbers[i]);
                    continue;
                }
            // System.out.print(numbers[i]);
                
            }
        }
    }
}
    

