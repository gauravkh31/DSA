import java.util.*;
public class StackEvaluationOfPrefix {
    public static void main(String[] args) {
        // postfix evalutaion and prefix evaluation me koi jyada diffferenece nhi hai, bs 2 frq hai. 1. loop ultaa chlega, 2. operation ka order v2 op v1 rhega prefix me jo ki postfix me v1 op v2 hota tha.
        String pf = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i =pf.length()-1; i >=0; i--){
            char ch = pf.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                val.push((int)ch-48);
            }else{
                int v2= val.pop();
                int v1 = val.pop();
                if(ch=='+'){val.push(v2+v1);}
                if(ch=='-'){val.push(v2-v1);}
                if(ch=='*'){val.push(v2*v1);}
                if(ch=='/'){val.push(v2/v1);}
            }
        }
        System.out.println(val.pop());
}

}
