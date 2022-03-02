package edu.pro;

import java.util.Locale;

public class Main {
    public static String prepareString(String str){
       str = str.toLowerCase(Locale.ROOT).replaceAll("[^a-zа-я]","");
        return str;
    }

    public static boolean isPalindrome1(String str){
        str = prepareString(str);
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += str.charAt(str.length() -1 - i);
        }
        return str.equals(reversed);
    }

        public static boolean isPalindrome2(String str){
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        return str.equals(reversed);
    }

        public static boolean isPalindrome3(String str){
            for (int i = 0; i < str.length() / 2 ; i++) {
                if( str.charAt(i) != str.charAt(str.length()-1 -i) ){
                    return  false;
                }
            }
        return true;
    }

    public static void main(String[] args) {
	  String s1 = "Аргентина манит негра.";
	  String stringToTestPalindrome;
        System.out.println(isPalindrome1(s1));

    }
}
