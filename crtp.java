import java.util.*;
public class crtp {
    public static int dice(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return dice(n-1)+dice(n-2)+dice(n-3)+dice(n-4)+dice(n-5)+dice(n-6);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = dice(n);
        System.out.println(p);

    }
    
}
