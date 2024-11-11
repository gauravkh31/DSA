import java.util.*;
public class StringBasics {
    public static void main(String[] args) {
        String s = "abcd";
        // System.out.println(s.contains("gaura kh"));

        for(int i =0; i < s.length(); i++){
            for(int j = i+1; j < s.length()+1; j++){
                System.out.print(s.substring(i, j));
            }
            System.out.println();
        }
    }
    
}
