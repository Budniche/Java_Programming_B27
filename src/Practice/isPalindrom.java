package Practice;

public class isPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("anna"));
        System.out.println("racecar");
        System.out.println("jkajskko");
    }

    public static boolean isPalindrom(String str){

        String reverse ="";
        for(int i =str.length()-1; i>=0; i--){
            reverse +=str.charAt(i);
        }
//
//        if(str.equalsIgnoreCase(reverse)) {
//            return true;
//        }else{
//            return false;
//        }
//
        return str.equalsIgnoreCase(reverse);
    }
}
