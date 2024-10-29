import java.util.*;
public class test {

    public static int candyShop(int n, int [] candies){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i =0; i < candies.length; i++){
            ts.add(candies[i]);
        }
        int sum = 0;
        for(int val: ts){
            sum+=val;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] a = {1,2,2,4,2,2};
        int ans = candyShop(6,a);
        System.out.println(ans);
    }
    
}
