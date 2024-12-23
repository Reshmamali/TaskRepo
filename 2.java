public class palimdrome{
    public static void main(String []args){
        String a = "Reshma";
        String reverse = "";

        for(int i = 1; i<=a.length()-1; i++){
            reverse = reverse + a.charAt(i);
        }
        System.out.print("Reverse string is" + reverse);

        if(reverse.equals(a)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}