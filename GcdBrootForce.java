import java.util.*;
public class GcdBrootForce {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        for(int i = 12; i >= 1; i--){
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                return; 
            }
        }
    }
}
