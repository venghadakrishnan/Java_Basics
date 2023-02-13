public class comparingstr {
    public static void main(String[] args){
        String a = "This is fucking";
        String b = "This is fucking";
        int re = a.compareTo(b);
        if(re==0){
            System.out.print("Both are equal");
        }
        else if(re >= 0 ){
            System.out.print("\""+a+"\""+"a is greater");
        }
        else{
            System.out.print("\""+b+"\""+"b is greater");
        }
    }
    
}
