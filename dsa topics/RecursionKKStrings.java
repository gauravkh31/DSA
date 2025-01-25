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
    




    // method to skip apple from a string using answer as argument 
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

 


    // method to skip apple from a string using not  answer as argument 
    public static String skipAWordWithOutArgument(String s, String word){
        if (s.isEmpty()) {
            return "";
        }

        
        char ch = s.charAt(0);
        if(s.startsWith(word)){
            return skipAWordWithOutArgument(s.substring(word.length()),word);
        }else{
            return ch+ skipAWordWithOutArgument(s.substring(1),word);
        }
    }




    public static void main(String[] args) {
        String s = "abccaddaac";
        String st = "applebccappddaappleca";

        String ans = "";
        System.out.println(skip(s,ans));
        System.out.println(skipWithoutArguement(s));
        System.out.println(skipAWord(st,"","apple"));
        System.out.println(skipAWordWithOutArgument(st,"apple"));

    }
}