import java.util.*;

public class Maximmum{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        int maximum = a;
        if(b>a){
            maximum = b;
        }else if(c>b){
            maximum = c;
        }
        System.out.println(maximum);
        sc.close();
    }
}