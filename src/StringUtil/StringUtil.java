package StringUtil;

import java.util.Scanner;

public class StringUtil {

    /**
     * these Methods are for concatenation for strings and strinbuilders
     * @param a
     * @param b
     */
    public void concate(String a,String b){
        System.out.println(a+b);
    }
    public void concate(String a , int b , String c){
        System.out.println(a+b+c);
    }
    public void concateStringBuilder(String a,String b){
        StringBuilder c = new StringBuilder();
        c.append(a);
        c.append(b);
        System.out.println(c);
    }

    /**
     * this method prints String spaces replaced with \n
     * @param a
     */
    public void newLine(String a){
        StringBuilder b = new StringBuilder();
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i) == ' '){
                b.append('\n');
            }else {
                b.append(a.charAt(i));
            }
        }
        System.out.println(b);
    }

    /**
     * this method reverse the string from last to first
     * @param a
     */
    public void revrs(String a){
        StringBuilder b = new StringBuilder();
        for (int i = a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }

    /**
     * this methods counts how many times is token used in line
     * @param line
     * @param token
     */
    public void countSubString(String line, String token){
        StringBuilder a = new StringBuilder();
        int count = 0;
        for (int i = 0;i < line.length()-1;i++){
            a.append(line.charAt(i));
            a.append(line.charAt(i + 1));
        }if (a.toString().equals(token)){
            count++;
        }
        System.out.println(count);
    }

    /**
     * this method is for string from lowercase it makes uppercase
     * @param a
     * @return
     */
    public String toUpercase(String a){
        return a.toUpperCase();
    }

    /**
     * this method is adding * until the Strings length will be 20 and is printing it if it is less than 20
     */
    public void star(){
        StringBuilder a = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        for (int i = 0;i < b.length();i++){
            a.append(b.charAt(i));
        }
        if (a.length()<20){
            System.out.println(a);
        }
        while (a.length()<=20){
            a.append('*');
        }
        System.out.println(a);
    }

    /**
     * this method removes char a-s from the string
     * @param a
     */
    public void rmv(String a){
        StringBuilder b = new StringBuilder();
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i) != 'a'){
                b.append(a.charAt(i));
            }
        }
        System.out.println(b);
    }

    /**
     * this method is replacing a to *
     * @param a
     */
    public void repl(String a){
        StringBuilder b = new StringBuilder();
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i)=='a'){
                b.append('*');
            }else{
                b.append(a.charAt(i));
            }
        }
        System.out.println(b);
    }

    /**
     * harc Karenin
     * @param a
     */
    public void max(String a){
        String max = "";
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i)!=' '){
                max +=a.charAt(i);

            }
        }

    }

    /**
     * this method find in which index is string c used
     * @param a
     * @param c
     */
    public void ind(String a, String c){
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i) == c.charAt(0)){
                System.out.println(i);
            }
        }
    }

    /**
     * this method prints till n index from the string
     * @param line
     * @param n
     */
    public void printSubLine(String line, int n){
        String finaly="";
        for (int i = 0;i <n;i++){
            finaly += line.charAt(i);
        }
        System.out.println(finaly);
    }
    public void printSubLine(StringBuilder line, int n){
        StringBuilder b = new StringBuilder();
        for (int i = 0;i<n;i++){
            b.append(line.charAt(i));
        }
        System.out.println(b);
    }

    /**
     * this method prints what is in the string
     * @param a
     */
    public void nll(String a){
        if (a == null){
            System.out.println("it is null");
        } else if (a == "") {
            System.out.println("it is empty");
        }else {
            System.out.println("it is not null and not empty");
        }
    }

};
