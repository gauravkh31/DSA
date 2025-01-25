
public class crtr{


    public static void print(int n , int m){
        if(n==1){
            return;
        }
        if(m ==18){
            return;
        }

        print(n-1,m);
        System.out.println(n);
        print(n,m+1);
    }
    public static void main(String[] args) {
        print(5,1);
    }
}