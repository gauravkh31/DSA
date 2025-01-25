import java.util.*;
public class Print {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println(-1);
            sc.close();
            return;
        }else{
        for(int i =2; i<=n ; i=i+2){
            System.out.println(i);
        }}
        sc.close();
    }
}
