import java.util.*;
public class RecursionKKStrings{




    // method 1 of skipping a 
    public static String skip(String s, String ans){
        if(s.isEmpty()){
            return ans;
        }
       
        if(s.charAt(0)=='a'){
            return skip(s.substring(1),ans);
        }else{
            ans+=s.charAt(0);
           return skip(s.substring(1),ans);

        }
    }




    // method 2 of skipping a 
    static String skipWithoutArguement(String s) {
        if (s.isEmpty()) {
            return "";
        }
    
        char ch = s.charAt(0);
    
        if (ch == 'a') {
            return skipWithoutArguement(s.substring(1));
        } 
        else {
            return ch + skipWithoutArguement(s.substring(1));
        }
    }
    




    // method to skip apple from a string 
    public static String skipAWord(String s, String ans, String word){
        if (s.isEmpty()) {
            return ans;
        }

        if(s.startsWith(word)){
           
            return skipAWord(s.substring(5), ans, word);
        }else{
            ans+=s.charAt(0);
            return skipAWord(s.substring(1), ans, word);

        }

    }




    public static void main(String[] args) {
        String s = "abccaddaac";
        String st = "applebccappddaappleca";

        String ans = "";
        System.out.println(skip(s,ans));
        System.out.println(skipWithoutArguement(s));
        System.out.println(skipAWord(st,"","apple"));

    }
}