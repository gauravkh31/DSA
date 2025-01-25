import java.util.Stack;

public class StackPostfixToInfix {
    public static void main(String[] args) {

        String pf = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i = 0; i < pf.length(); i++) {
            char ch = pf.charAt(i);
            if ((int) ch >= 48 && (int) ch <= 57) {
                String s = "" + ch;
                val.push(s);
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                val.push("(" + v1 + ch + v2 + ")");
            }
        }
        System.out.println(val.pop());
    }

}
