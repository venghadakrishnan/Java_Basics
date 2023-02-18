public class ingnorecase {
    public static void main(String[] args){
        String a = "Harshada VK";
        String b = "Komal";
        String c = "harshada vk";

        boolean x = a.equalsIgnoreCase(b);
        boolean y = a.equalsIgnoreCase(c);

        System.out.println(x);
        System.out.print(y);
        }
    
}
