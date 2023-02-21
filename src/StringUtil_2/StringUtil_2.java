package StringUtil_2;

import java.util.ArrayList;
import java.util.List;

public class StringUtil_2 {
    /**
     * Given a string, return a string made of the first 2 chars (if present), however
     * include first char only if it is 'o' and include the second only if it is 'z', so
     * "ozymandias" yields "oz"
     * @param a
     * @return
     */
    public String firstTwo(String a){
            if (a.startsWith("o")){
                return "o";
            }else if (a.startsWith("oz")){
                return "oz";
            }else {
                return "";
            }
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx".
     * @param a
     * @return
     */
    public int countx(String a){
        int count = 0;
        for (int i = 0;i< a.length();i++){
            if (a.substring(i,i+1).equals("xx")){
                count++;
            }
        }
        return count;
    }

    /**
     * A palindrome is a word which reads the same backward or forward. 'abcba' is
     * a palindrome. Write a method that detects if a string is a palindrome
     * @param a
     */
    public String palidrom(String a){
        for (int i = 0;i < a.length()/2;i++){
            for (int j = (a.length() - 1)/2;j >= 0;j--){
                if (a.charAt(i) == a.charAt(j)){
                    return a;
                }else {
                    System.out.println("it is not palindrome");
                }
            }
        }return null;
    }

    /**
     * Given a list of strings, write a method that returns a list of all strings that
     * start with the letter 'a' (lower case) and have exactly 3 letters
     * @param a
     * @return
     */
    public List<String> starta(List<String> a){
        if (a.size()==3){
            if (a.get(0).startsWith("a")){
                return a;
            }
        }
        return null;
    }

    /**
     * cesar method
     * @param a
     * @return
     */
    public String cezar(String a){
        StringBuilder str = new StringBuilder();
        for (int i = 0;i<a.length();i++){
            char b = a.charAt(i);
            if (b >= 'a' && b<= 'z'){
                b = (char) (b-5);
                if (b < 'a'){
                    b=(char) (b + 'z' - 'a' + 1);
                }
                str.append(b);
            }
        }return str.toString();
    }

    /**
     * A palindrome is a word which reads the same backward or forward. 'abcba' is
     * a palindrome. Write a method that returns the longest palindrome substring
     * of a given string.
     * @param a
     * @param b
     * @return
     */
    public String longestPalindrome(String a, String b){
        if (palidrom(a).length()>palidrom(b).length()){
            return a;
        }else {
            return b;
        }
    }


}
