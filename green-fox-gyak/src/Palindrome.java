public class Palindrome {
    public static String createPalindrome(String text){
        StringBuilder str=new StringBuilder(text);
        return text+str.reverse();
    }
    public static String createPalindromeByFor(String text){
        String []array=text.split("");
        String reverse=null;
        for (int i = array.length-1; i >=0 ; i--) {
            reverse+=array[i];
            //reverse+=charAt(i);
        }
        return text+reverse;
    }
    public static String[]searchPalindrome(String text){
        return new String[5];//TODO

    }
    public static boolean isPalindrome(String text){
        StringBuilder str=new StringBuilder(text);
        return str.reverse().toString().equals(text);
    }
    public static void main(String[] args) {

    }
    //  StringBuilder builder = new StringBuilder(str);
    //        for (int i = 0; i < str.length(); i++) {
    //            builder.append(str.charAt(str.length() - 1 - i));
    //        }
    //
    //        return builder.toString();

}
