import java.util.*;
public class StackEvaluationOfPostfix {
    public static void main(String[] args) {
        String pf = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i =0; i < pf.length(); i++){
            char ch = pf.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                val.push((int)ch-48);
            }else{
                int v2= val.pop();
                int v1 = val.pop();
                if(ch=='+'){val.push(v1+v2);}
                if(ch=='-'){val.push(v1-v2);}
                if(ch=='*'){val.push(v1*v2);}
                if(ch=='/'){val.push(v1/v2);}
            }
        }
        System.out.println(val.pop());
    }
    
}
