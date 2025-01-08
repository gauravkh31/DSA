import java.util.*;

public class StackInfixToPostFix {
      public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
                
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // agr woh element integer hai toh direct usko val me push kr denge.
            if ((int) ch >= 48 && (int) ch <= 57) {
                String s = ""+ ch;
                val.push(s);
            }
            // agr woh integer nhi hai toh chack krenge age us time op poora khaali hai toh
            // direct usko push kr denge op me, and agr wo openiing paranthesis hai toh bhi
            // usko op me push kr denge and agr us time jb woh aya tb agr op ke peek pe
            // opening bracket hai toh bhi us element ko direct push kr dengge op me ..
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            // agr woh element closing paranthesis hai toh phle usko solve krna pdega mtlb
            // ki val se 2 values pop krenge and jb tk op me opening paranthesis nhi aa jata
            // tb tk val ke top 2 elements pe prefix bnaate rhenge and result ko val me
            // push krke operator ko op se pop krte rhenge and jb opening bracket mil
            // jayeaga tb usko bhi op se pop kr denge
            else if (ch == ')') {
                while (op.peek() != '(') {
                   
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.peek();
                    String insert = v1+v2+o;
                    val.push(insert);

                    op.pop();

                }
                op.pop();

            }
         
            else {

                // agr + ya - ayenge toh jo op ke peek pe jo hai woh operatoin kr denge,and
            // result ko push kr denge val me and then us operator ko pop krke jo operator
            // aya hai usko push kr denge .
            if (ch == '+' || ch == '-') {
                String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.peek();
                    String insert = v1+v2+o;
                    val.push(insert);
                op.pop();
                op.push(ch);

            }

                  // agr * ya / ayenge toh agr peek pe * ya / hai toh hee operatoin kr denge,and
                // result ko push kr denge val me and then us operator ko pop krke jo operator
                // aya hai usko push kr denge .
                if (ch == '*' || ch == '/') {
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.peek();
                        String insert = v1+v2+o;
                        val.push(insert);
                    op.pop();
                    op.push(ch);
                    }else{
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.peek();
            String insert = v1+v2+o;
            val.push(insert);
            op.pop();

        }
        System.out.println(val.peek());
    }   
}
