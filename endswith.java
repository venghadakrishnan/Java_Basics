public class endswith {
    public static void main(String[] args){
        String str1 = "harshada";
        String str2 = "harshadavk";

        String end = "vk";
        boolean one = str1.endsWith(end);
        boolean two = str2.endsWith(end);

        System.out.println(""+str1+" "+end+" " +one+"");
        System.out.println(""+str2+" "+end+" " +two+"");

    }
    
}
