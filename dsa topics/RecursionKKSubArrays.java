import java.util.*;
public class RecursionKKSubArrays {
    // method 1 : using processed or answer in the arguement of the function call 
    // public static void subStrings(String up, String p){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

        
    //     subStrings(up.substring(1), p+up.charAt(0));
    //     subStrings(up.substring(1),p);

    // }




    // method: 2 without using answer or processed string in the funcition call as arguemment 


    public static ArrayList<String> subStrings(String up, String p){

        ArrayList<String> list = new ArrayList<>();


        if(up.isEmpty()){
            
            
        }
        list.add(up.charAt(0));





        ArrayList<String> including = up.charAt(0) + subStrings(up.substring(1));
        ArrayList<String> withoutIncluding = subStrings(up.substring(1));



        
        subStrings(up.substring(1), p+up.charAt(0));
        subStrings(up.substring(1),p);

    }




    public static void main(String[] args) {
        String s = "abcd";
        // subStrings(s,"");



        
    }
    
}
