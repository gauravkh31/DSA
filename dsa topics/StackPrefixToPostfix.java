import java.util.*;

public class StackPrefixToPostfix {
    
        public static void main(String[] args) {
        
        String pf = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i =pf.length()-1; i >=0; i--){
            char ch = pf.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                String s = ""+ ch;
                val.push(s);
            }else{
                String v2= val.pop();
                String v1 = val.pop();
                val.push(v2+v1+ch);
            }
        }
        System.out.println(val.pop());
}

}
